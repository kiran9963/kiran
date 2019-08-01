package org.comp;

public class CpmpanyInfo {
	
		public void cpmpanyId(int id) {
			System.out.println("company id is:"+id);
			
		}
		public void cpmpanyname(String name) {
			System.out.println("name is"+name);
		}
		public void cpmpanyadress(String Adress) {
			System.out.println("address :"+Adress);
		}
		public static void main(String[] args) {
			CpmpanyInfo c=new CpmpanyInfo();
			c.cpmpanyId(1234);
			c.cpmpanyname("kjhdka@sdbhasjd76");
			c.cpmpanyadress("omr");
			
		}
	}


