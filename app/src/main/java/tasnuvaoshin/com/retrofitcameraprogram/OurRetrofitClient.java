package tasnuvaoshin.com.retrofitcameraprogram;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface OurRetrofitClient {
    @FormUrlEncoded
    @POST("retrofit.php")
    Call<ResponseClass> UploadImage(
            @Field("name") String name,
            @Field("image") String image
    );

}
