int minus =1;
	int idx = 0;
	if(s.charAt(0)=='-'){
	    minus = -1;
	    idx++;
	} 

	int num =0;
    	for(int i=idx;i<s.length();i++){

	        char c = s.charAt(i);

	        if(c>='0' && c<='9'){
	            num = num*10 + c-'0';
	        }else return -1;
	    }

	    return minus*num;
