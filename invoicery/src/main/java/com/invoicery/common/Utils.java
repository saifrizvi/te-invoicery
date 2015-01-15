/**
 * Name			 : Utils.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.common;

import java.util.Map;


public final class Utils {

	/**
	 * 
	 * @param sheetTbl
	 * @param fieldName
	 * @return
	 */
	public static int lookupInd(Map<String, Integer> sheetTbl, String fieldName) {
		int lookupInd=-1;
		lookupInd=sheetTbl.get(fieldName).intValue();
		return lookupInd;
	}

}
