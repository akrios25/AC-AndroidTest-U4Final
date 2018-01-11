package nyc.c4q.androidtest_unit4final;

import android.util.Log;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * Created by justiceo on 1/7/18.
 */

public class Sort {

    private static final String TAG = "Check response";

    /**
     * Sorts a list using the selection sort algorithm.
     * See lecture on sorting: https://github.com/C4Q/AC-Android/tree/v2/DSA/sorting
     * <p>
     * When `isAscending` is true, the list is sorted in ascending alphabetical order from a to z,
     * otherwise it is sorted in descending order from z to a.
     *
     * @param list
     * @param isAscending
     */
    public static void selectionSort(List<String> list, boolean isAscending) {}
        // TODO: Implement selection sort.
        // You may not use Collections.sort or its equivalent
        // You may not implement another sorting algorithm that is not "selection sort"
        // Tip: Try a version without ordering first.
//        private void makeRequestWithOkHttp(){
//            String url = "https://raw.githubusercontent.com/operable/cog/master/priv/css-color-names.json";
//            OkHttpClient client = new OkHttpClient();
//            Request request = new Request.Builder()
//                    .url(url)
//                    .build();
//            client.newCall(request).enqueue(new Callback() {
//                @Override
//                public void onFailure(Request request, IOException e) {
//                    Log.d("FAIL===", "onFail: ");
//                }
//                @Override
//                public void onResponse(Response response) throws IOException {
//                    String jsonData = response.body().string();
//                    Log.d("RESULT===", "onResponse: " + jsonData);
//                      try {
//                        JSONArray jsonArray = new JSONArray(jsonData);
//
//                      }
//                      catch (JSONException e) {
//                        e.printStackTrace();
//                       }
//                }
//            });
//        }
//
//    }

/*for (int i = list.size(); i > 0; i--) {
            Log.d(TAG, "onResponse: IT IS RUNNING");
                    // step 1: find largest element
                    int lastItem = 0;
                    for (int n = 0; n < i; i++) {
        if (colorsList.get(n).getName().compareTo(colorsList.get(lastItem).getName()) > 0) {
        lastItem = n;
        }
        }
        // step 2: swap the elements
        colors tmp = bookList.get(lastItem);
        bookList.set(lastItem, bookList.get(i - 1));
        bookList.set(i - 1, tmp);
        }*/
    }