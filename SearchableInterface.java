package JavaTask;
interface Searchable{
	void search(String keyword);
}
class Document implements Searchable{
	String data;
	public void Document(String data) {
		this.data=data;
		
	}

	@Override
	public void search(String keyword) {
		if(data.contains(keyword)) {
			System.out.println("Keyword Found!!!");
			
		}
		else {
			System.out.println("Keyword Not Found!!!");
		}
		
	}
	
}
class WebPage implements Searchable{
	String data;
	void Webpage(String data) {
		this.data=data;
	}

	@Override
	public void search(String keyword) {
		if(data.contains(keyword)) {
			System.out.println("Keyword Found!");
		}
		else {
			System.out.println("Keyword not found!");
		}
	}
	
}

public class SearchableInterface {

	public static void main(String[] args) {
		Document doc=new Document();
		doc.Document("This document contains some data or content for java programming");
		WebPage web=new WebPage();
		web.Webpage("This Webpage contains some examples of java programming");
		
		doc.search("data");
		doc.search("not found");
		web.search("java");
		web.search("not found");

	}

}
