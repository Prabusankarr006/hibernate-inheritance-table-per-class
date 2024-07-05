package com.use;

import org.hibernate.*;
public class TPCExample1 
{
	public static void main(String[]args)
	{
		Transaction tr=null;
		try (Session ses=HBUtil1.getSessionFactory().openSession())
		{
			tr=ses.beginTransaction();
			Employee1 e1=new Employee1( "Navaneethan");
			RegularEmployee e2=new RegularEmployee("sales",5500,10000);
			Trainee1 e3=new Trainee1("6 months",200,"Prabu");
			
			ses.persist(e1); 
			ses.persist(e2); 
			ses.persist(e3);
			tr.commit();
			ses.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}