class DefangingIp{
    static String defangingIpAddress(String address){
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        String s="1.1.1.1";
        String res=defangingIpAddress(s);
        System.out.println("Defanging an IP address: "+res);
    }
}