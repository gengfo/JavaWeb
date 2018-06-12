package com.helloweenvsfei.servlet;

/** 
 * ���û�ȡ�ͻ�����Ϣ�Ĺ��� 
 *  
 */  
public final class Net {  
    /** 
     * Logger for this class 
     */  
    //private static Logger logger = Logger.getLogger(RandomCodeUtils.class);
	  
    /** 
     * ��ȡ��������IP��ַ,���ͨ�������������͸������ǽ��ȡ��ʵIP��ַ; 
     *  
     * @param request 
     * @return 
     * @throws IOException 
     */ 
    
    public final static String getIpAddress(HttpServletRequest request) throws IOException {  
        // ��ȡ��������IP��ַ,���ͨ�������������͸������ǽ��ȡ��ʵIP��ַ  
  
        String ip = request.getHeader("X-Forwarded-For");  
        
        System.out.println("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);  
          
  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("Proxy-Client-IP");  
                 
                System.out.println("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);  
                  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("WL-Proxy-Client-IP");  
                 
                System.out.println("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);  
                  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_CLIENT_IP");  
                  
                System.out.println("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" + ip);  
                  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
                  
                    System.out.println("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);  
                  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getRemoteAddr();  
                
                System.out.println("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);  
                  
            }  
        } else if (ip.length() > 15) {  
            String[] ips = ip.split(",");  
            for (int index = 0; index < ips.length; index++) {  
                String strIp = (String) ips[index];  
                if (!("unknown".equalsIgnoreCase(strIp))) {  
                    ip = strIp;  
                    break;  
                }  
            }  
        }  
        return ip;  
    }  
}  