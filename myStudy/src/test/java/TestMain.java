import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by web on 2020/5/11.
 */
public class TestMain {
    public static void main(String[] args){
        String data =
                 "[\n" +
                         "   {\n" +
                         "      \"conftype\" : \"1\",\n" +
                         "      \"gIndex\" : 0,\n" +
                         "      \"id\" : \"39\",\n" +
                         "      \"name\" : \"颜色\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"1340\",\n" +
                         "            \"name\" : \"其他颜色\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"6856\",\n" +
                         "            \"name\" : \"雅灰\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"6817\",\n" +
                         "            \"name\" : \"茶橘\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"6816\",\n" +
                         "            \"name\" : \"缎黑\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"1\",\n" +
                         "      \"gIndex\" : 1,\n" +
                         "      \"id\" : \"32\",\n" +
                         "      \"name\" : \"存储容量\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"3235\",\n" +
                         "            \"name\" : \"12GB+256GB\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"2791\",\n" +
                         "            \"name\" : \"12GB+512GB\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"2\",\n" +
                         "      \"gIndex\" : 2,\n" +
                         "      \"id\" : \"76\",\n" +
                         "      \"name\" : \"机身外观\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"77\",\n" +
                         "            \"name\" : \"外观完好，无任何使用痕迹\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"78\",\n" +
                         "            \"name\" : \"外观轻微划痕或轻微磕碰\",\n" +
                         "            \"pictures\" : [ \"https://s1.huishoubao.com/img/phone/外观有划痕.JPG\" ]\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"79\",\n" +
                         "            \"name\" : \"外观有磕碰或掉漆\",\n" +
                         "            \"pictures\" : [ \"https://s1.huishoubao.com/img/phone/外观有磕碰或掉漆.JPG\" ]\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"3242\",\n" +
                         "            \"name\" : \"外壳有变形/裂缝/缺失\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"3243\",\n" +
                         "            \"name\" : \"主板部位的弯曲或断裂\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"2\",\n" +
                         "      \"gIndex\" : 3,\n" +
                         "      \"id\" : \"72\",\n" +
                         "      \"name\" : \"屏幕外观\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"73\",\n" +
                         "            \"name\" : \"屏幕完好，无任何划痕\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"5530\",\n" +
                         "            \"name\" : \"屏幕轻微划痕\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"5531\",\n" +
                         "            \"name\" : \"屏幕明显划痕\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"3244\",\n" +
                         "            \"name\" : \"屏幕有缺角/碎裂/脱胶/气泡\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"2\",\n" +
                         "      \"gIndex\" : 4,\n" +
                         "      \"id\" : \"67\",\n" +
                         "      \"name\" : \"屏幕显示\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"71\",\n" +
                         "            \"name\" : \"显示正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"68\",\n" +
                         "            \"name\" : \"亮点/色差/轻微发黄\",\n" +
                         "            \"pictures\" : [ \"https://s1.huishoubao.com/img/phone/轻微背光异常.png\" ]\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"69\",\n" +
                         "            \"name\" : \"严重老化/色斑\",\n" +
                         "            \"pictures\" : [ \"https://s1.huishoubao.com/img/phone/严重背关或严重色差.png\" ]\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"3247\",\n" +
                         "            \"name\" : \"显示异常（断线/漏液/闪屏等）\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"236\",\n" +
                         "            \"name\" : \"不显示\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"2\",\n" +
                         "      \"gIndex\" : 5,\n" +
                         "      \"id\" : \"60\",\n" +
                         "      \"name\" : \"维修\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"63\",\n" +
                         "            \"name\" : \"无拆机无维修\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"62\",\n" +
                         "            \"name\" : \"小维修/小故障\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"61\",\n" +
                         "            \"name\" : \"修主板/多次维修\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"2\",\n" +
                         "      \"gIndex\" : 6,\n" +
                         "      \"id\" : \"7\",\n" +
                         "      \"name\" : \"ID锁\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"9\",\n" +
                         "            \"name\" : \"ID/账户锁已解除\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"8\",\n" +
                         "            \"name\" : \"ID/账户锁无法解除\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   },\n" +
                         "   {\n" +
                         "      \"conftype\" : \"3\",\n" +
                         "      \"gIndex\" : 7,\n" +
                         "      \"id\" : \"0\",\n" +
                         "      \"name\" : \"功能选项(可多选或不选)\",\n" +
                         "      \"questions\" : [\n" +
                         "         {\n" +
                         "            \"id\" : \"6703\",\n" +
                         "            \"name\" : \"面容识别不正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"224\",\n" +
                         "            \"name\" : \"拍照摄像不正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"6930\",\n" +
                         "            \"name\" : \"拍照有斑\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"3245\",\n" +
                         "            \"name\" : \"触摸屏失灵\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"2170\",\n" +
                         "            \"name\" : \"屏幕更换/维修\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"5534\",\n" +
                         "            \"name\" : \"电池更换维修\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"66\",\n" +
                         "            \"name\" : \"通话不正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"58\",\n" +
                         "            \"name\" : \"机身进水/受潮\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"56\",\n" +
                         "            \"name\" : \"WIFI不正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"20\",\n" +
                         "            \"name\" : \"全新(整套/未激活/未使用)\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"52\",\n" +
                         "            \"name\" : \"指纹功能不正常\"\n" +
                         "         },\n" +
                         "         {\n" +
                         "            \"id\" : \"24\",\n" +
                         "            \"name\" : \"不能正常开机\"\n" +
                         "         }\n" +
                         "      ]\n" +
                         "   }\n" +
                         "]";
        JSONArray title = JSON.parseArray(data);
        List<String> result = new ArrayList<>();
        getList(title,0,result,"");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void getList(JSONArray jsonObject,int type,List<String> result,String son){
        int size = jsonObject.size();
        JSONObject str =  jsonObject.getJSONObject(type);
        JSONArray questions = str.getJSONArray("questions");
        int size1 = questions.size();
        String sonCopy = new String(son);
        for (int k = 1;k < size1 ;k ++){
            JSONObject son2 =  questions.getJSONObject(k);
            String name = (String) son2.get("name");
            String id = (String) son2.get("id");
            String splite = "";
            if (son!=null && !son.equals("")){
                splite = "#";
            }
            if (type == size - 1 ){
                result.add(sonCopy + splite + id);
            }else {
                int j = type + 1;
                getList(jsonObject,j,result,sonCopy + splite + id);
            }
        }
    }
}
