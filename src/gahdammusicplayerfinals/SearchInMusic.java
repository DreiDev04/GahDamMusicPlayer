package gahdammusicplayerfinals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchInMusic {

    ExtractInfo extractInfo = new ExtractInfo();

    public void searchMusic(String searchValue) {
//        String regexPattern = "\\b" + Pattern.quote(searchValue) + "\\b";
//
//        for (String element : extractInfo.fileNames) {
//            Matcher matcher = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE).matcher(element);
//
//            if (matcher.find()) {
//                System.out.println("Match found in element: " + element);
//
//            }
//        }
        System.out.println("Search Value: " + searchValue);
    }
}
