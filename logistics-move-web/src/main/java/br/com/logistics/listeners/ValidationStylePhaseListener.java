package br.com.logistics.listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
 
public class ValidationStylePhaseListener implements PhaseListener {
 
	private static final long serialVersionUID = 3168894664069016177L;
	
	private final String ORIGINAL_STYLE = "alert";
 
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
 
    @SuppressWarnings("rawtypes")
	public void beforePhase(PhaseEvent phaseEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        UIViewRoot root =  context.getViewRoot();
        restoreOriginalStyles(context, root);
        Iterator i = context.getClientIdsWithMessages();
 
        while (i.hasNext()) {
            String id = (String) i.next();
            UIComponent component = root.findComponent(id);
 
            if (component instanceof UIInput) {
                String style = (String) component.getAttributes().get("styleClass");
                style = style == null ? "" : " " + style;
                component.getAttributes().put("styleClass", "alert" + style);
                saveOriginalStyle(id, style, context);
            }
        }
    }
 
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void restoreOriginalStyles(FacesContext context, UIViewRoot root) {
		Map session = context.getExternalContext().getSessionMap();
 
        if (session.containsKey(ORIGINAL_STYLE)) {
 
            List<Map> lista = (List) session.get(ORIGINAL_STYLE);
 
            for (Map item : lista) {
                Map.Entry entry = (Entry) item.entrySet().iterator().next();
                UIComponent component = root.findComponent((String) entry.getKey());
 
                if (component != null) {
                    component.getAttributes().put("styleClass", entry.getValue());
                }
            }
 
            session.remove(ORIGINAL_STYLE);
        }
    }
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void saveOriginalStyle(String id, String style, FacesContext context) {
        Map session = context.getExternalContext().getSessionMap();
        Map originalStyle = new HashMap();
        originalStyle.put(id, style);
 
        if (session.get(ORIGINAL_STYLE) == null) {
            session.put(ORIGINAL_STYLE, new ArrayList());
        }
 
        ((List)session.get(ORIGINAL_STYLE)).add(originalStyle);
    }
 
    public void afterPhase(PhaseEvent phaseEvent) {}
}
