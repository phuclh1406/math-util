/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phucle.mathutil.core;

/**
 *
 * @author predator
 */
public class MathUtil {
    
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa
    //n! = 1.2.3.4... n
    //ko có âm giai thừa
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặt biệt
        
        long product = 1; //tích nhân dồn
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
}
