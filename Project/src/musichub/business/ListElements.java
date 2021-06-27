package musichub.business;

import java.util.ArrayList;
import java.util.UUID;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface ListElements {
	
	public void addElement (UUID element);
	public ArrayList<UUID> getElements();
	public void createXMLElement(Document document, Element parentElement);
}
