package com.zeta.customException;

import com.zeta.logger.LoggerFile;

public class CustomExceptionDemo {

	public static void main(String[] args) throws ZetaCustomException {
		// TODO Auto-generated method stub
		LoggerFile log = new LoggerFile();
		try{
			byte a = 1;
			byte b = 2;
					
			int z = a+b;
			
			if(z >= 10){
				throw new ZetaCustomException("Not able to add to byte in other ");
			}
			
			log.lg.info("value of Z : " + z  );
		}catch(Exception err){
			log.lg.error(err);
		}
	}

}
