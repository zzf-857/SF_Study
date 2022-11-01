public class select {
    public static void main(String[] args) {
        int px[]=new int[]{12,15,31,20,11,1,5,8,18};
        /********选择排序
         search(px);
        *********/
        /*******冒泡排序
         mp(px);
         *******/

        /********插入排序
         sx_search(px,15);
         *******/

        cr(px);
        for (int item:px)
        {
            System.out.print(item+" ");
        }
    }
    //选择排序
    public static void search(int[] px)
    {
        int temp;
        int min;
        for (int i=0;i<px.length;i++)
        {
            min=i;
            for (int j=i+1;j<px.length;j++)
            {
                if (px[min]>px[j])
                {
                    min=j;
                }
            }
            temp=px[min];
            px[min]=px[i];
            px[i]=temp;
        }
        System.out.println("这是选择排序后：");
    }


    //冒泡排序
    public static void mp(int[] px)
    {
        int temp;
        for (int i=0;i<px.length;i++)
        {
            for (int j=0;j<px.length-1-i;j++)
            {
                if (px[j+1]<px[j])
                {
                    temp=px[j+1];
                    px[j+1]=px[j];
                    px[j]=temp;
                }
            }
        }
        System.out.println("这是冒泡排序后：");
    }

    //插入排序
    public static void cr(int[] px)
    {
        /*****
         for (int i=1;i<px.length;i++)
         {
         int key=px[i];
         int j=i-1;
         while(j>=0&&px[j]>key)
         {
         px[j+1]=px[j];
         j--;
         }
         px[j+1]=key;
         }
         ******/
        for (int i=0;i<px.length;i++)
        {
            int key=px[i];
            int j=i-1;
            while(j>=0&&px[j]>key)
            {
                px[j+1]=px[j];
                j--;
            }
            px[j+1]=key;
        }
    }

    //顺序查找
    public static void sx_search(int[] px,int k)
    {
        /****for循环方法
        for (int i=0;i<px.length;i++)
        {
            if (px[i]==k)
            {
                System.out.println("找到了符合k值,位置为"+i);
                break;
            }
            else
            {
                System.out.println("没找到需要的值");
                break;
            }
        }
        *******/
        int i=0;
        while(px[i]!=k)
        {
            i+=1;
            if(i>px.length-1)
            {
                System.out.println("没有要找的值");
                return;
            }
        }
            System.out.println("找到了k值,对于的位置为"+i);
    }
}
