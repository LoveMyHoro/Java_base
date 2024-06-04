public class test_敏感词替换 {
    public static void main(String[] args) {
        String talk="sb你玩的真好，下次不要再玩了，cnm";
        //1.建立敏感词库
        String []arr={"cnm","mlgb","sb"};
        //2.替换
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
