package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/85/2012년_LG_DIOS_신제품_출시,_김태희_모델_촬영_컷_-_Flickr_-_LGEPR_(10).jpg";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/kimth.jpg")){
				
				int result;
				
				while((result = is.read()) != -1){
					os.write(result);
				}
				
				System.out.println("파일 쓰기 완료!!!");
			}
			catch (Exception e){
				e.printStackTrace();
			}
		} 
		catch (MalformedURLException e){
			e.printStackTrace();
		}
	}

}
