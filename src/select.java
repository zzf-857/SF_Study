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
         cr(px);
         ************/


        /*******归并排序
         hb_sort(px);
         *************/




        /********顺序查找
         sx_search(px,15);
         *******/


        /********快速排序

         ***********/
        quick_search(px, 0, px.length - 1);

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
        for(int i=1;i<px.length;i++)
        {
            int key=px[i];//设置一个用来装后面一个参数（以为如果找到比较小的，需要换位置，前面的会覆盖掉后面的）
            int j=i-1;//设置一前一后对比的下标，j代表下标前一位，i代表下标后一位
            while(j>=0&&px[j]>key)//这里的j>=0是用于判断一路交换是否到头了，px[j]>key是用于判断后面一个是否比前面的小
            {
                //没有到头，且后面比前面的小
                px[j+1]=px[j];//把前面的后移一个位置（把大的放后面去）
                j--;//把下标的前一位再往前推一位
            }
            px[j+1]=key;//如果位置换完后用被覆盖的k再覆盖j+1位置
        }
    }




    //归并排序
    public static void hb_sort(int px[])
    {
        int n=px.length;
        int px_temp[]=new int[n];
        if(px_temp.length!=0)
        {
            hebing_sort(px,px_temp,0,n-1);
        }
    }

    public static void hebing_sort(int[] px,int[] px_temp,int left,int right)
    {
        if (left<right)
        {
            int mid=(left+right)/2;
            hebing_sort(px,px_temp,left,mid);
            hebing_sort(px,px_temp,mid+1,right);
            hebing(px,px_temp,left,mid,right);
        }
    }

    public static void hebing(int[] px,int[] px_temp,int left,int mid,int right)
    {
        int l_pos=left;
        int r_pos=mid+1;
        int pos=left;

        while(l_pos<=mid&&r_pos<=right)
        {
            if (px[l_pos]<px[r_pos])
            {
                px_temp[pos++]=px[l_pos++];
            }
            else {
                px_temp[pos++]=px[r_pos++];
            }
        }

        while(l_pos<=mid)
        {
            px_temp[pos++]=px[l_pos++];
        }
        while (r_pos<=right)
        {
            px_temp[pos++]=px[r_pos++];
        }
        while(left<=right)
        {
            px[left]=px_temp[left];
            left++;
        }
    }



    //快速排序
    public static void quick_search(int[] px,int low,int high)
    {
        if(low<high)
        {
            int mid=partition(px,low,high);
            quick_search(px,low,mid-1);
            quick_search(px,mid+1,high);
        }
    }

    public static int partition(int[] px, int low ,int high)
    {
        int pivot=px[high];
        int i=low-1;
        int temp;
        int temp2;
        for (int j=low;j<high;j++)
        {
            if (px[j]<pivot)
            {
                temp=px[j];
                px[j]=px[++i];
                px[i]=temp;
            }
        }
        temp2=px[high];
        px[high]=px[i+1];
        px[i+1]=temp2;
        return i+1;
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
