module HelloJAVA11.RestAPI{
	
	
	requires HelloJAVA11.DataAccess;
	requires java.logging;
	requires org.apache.commons.lang3;
	requires HelloJAVA11.Model; 
	
	uses de.berlin.home.kang.dataaccess.DaoInterface;
}