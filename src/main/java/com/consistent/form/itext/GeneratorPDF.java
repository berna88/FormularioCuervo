package com.consistent.form.itext;

import com.itextpdf.text.Document;

public class GeneratorPDF {
	/*
	 * private void writePDF() { Document document = new Document(); try { String
	 * path = new File(".").getCanonicalPath(); String fILE_NAME = path +
	 * "/itext-test-file.pdf";
	 * 
	 * PdfWriter.getInstance(document, new FileOutputStream(new File(fILE_NAME)));
	 * 
	 * document.open(); Paragraph paragraph = new Paragraph();
	 * paragraph.add("Hello iText paragraph!");
	 * paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
	 * 
	 * document.add(paragraph); Paragraph paragraphLorem = new Paragraph();
	 * paragraphLorem.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit."
	 * + "Maecenas finibus fringilla turpis, vitae fringilla justo." +
	 * "Sed imperdiet purus quis tellus molestie, et finibus risus placerat." +
	 * "Donec convallis eget felis vitae interdum. Praesent varius risus et dictum hendrerit."
	 * +
	 * "Aenean eu semper nunc. Aenean posuere viverra orci in hendrerit. Aenean dui purus, eleifend nec tellus vitae,"
	 * + " pretium dignissim ex. Aliquam erat volutpat. "); java.util.List<Element>
	 * paragraphList = new ArrayList<>();
	 * 
	 * paragraphList = paragraphLorem.breakUp();
	 * 
	 * Font f = new Font(); f.setFamily(FontFamily.COURIER.name());
	 * f.setStyle(Font.BOLDITALIC); f.setSize(8);
	 * 
	 * Paragraph p3 = new Paragraph(); p3.setFont(f); p3.addAll(paragraphList);
	 * p3.add("TEST LOREM IPSUM DOLOR SIT AMET CONSECTETUR ADIPISCING ELIT!");
	 * 
	 * document.add(paragraphLorem); document.add(p3); document.close(); } catch
	 * (Exception e) { // TODO: handle exception } }
	 */	 
	private void writePDF() {
		Document document = new Document();
	}
}
