module HelloJAVA11.DataAccess.FileAccess {

	exports de.berlin.home.kang.dataaccess.fileaccess;

	requires  transitive HelloJAVA11.DataAccess;
	requires  HelloJAVA11.Model;

	provides de.berlin.home.kang.dataaccess.DaoInterface 
		with de.berlin.home.kang.dataaccess.fileaccess.FileAccess;
}