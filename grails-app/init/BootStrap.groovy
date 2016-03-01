class BootStrap {

    def init = { servletContext ->
	
        log.info("Storing value...")
        SystemVariable.storeProperty('test_var_value', 'test_var_value');


    }
    def destroy = {
    }
}
