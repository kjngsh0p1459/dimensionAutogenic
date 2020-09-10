package com.dimenify.modified.util;

public interface Constants {
    String SAVE_PREFIX = "com.dimenify.modified";
    String MIGRATION_FLAG = "v2Tov3";
    String SAVE_PREFIX_V2 = "com.dimenify.modified.v2";
    String INIT_MODEL_JSON = "[{\"bucket\":\"base\",\"directory\":" +
            "\"values\",\"factorSp\":1,\"factorDp\":1,\"isSelected\":true," +
            "\"isMandatory\":true}," +
            "{\"bucket\":\"sw320dp\",\"directory\":\"values-sw320dp\",\"factorSp\":0.88888888888,\"factorDp\":0.88888888888,\"isSelected\":true,\"isMandatory\":true}," +
            "{\"bucket\":\"sw360dp\",\"factorSp\":1.0,\"factorDp\":1.0,\"directory\":\"values-sw360dp\",\"isSelected\":true,\"isMandatory\":true}," +
            "{\"bucket\":\"sw411dp\",\"factorSp\":1.14166666667,\"factorDp\":1.14166666667,\"directory\":\"values-sw411dp\",\"isSelected\":true,\"isMandatory\":true}," +
            "{\"bucket\":\"sw480dp\",\"factorSp\":1.33333333333,\"factorDp\":1.33333333333,\"directory\":\"values-sw480dp\",\"isSelected\":true,\"isMandatory\":true}," +
            "{\"bucket\":\"sw600dp\",\"factorSp\":1.66666666667,\"factorDp\":1.66666666667,\"directory\":\"values-sw600dp\",\"isSelected\":true,\"isMandatory\":true}," +
            "{\"bucket\":\"sw720dp\",\"factorSp\":1.85,\"factorDp\":1.85,\"directory\":\"values-sw720dp\",\"isSelected\":true,\"isMandatory\":true}]";
    String RESOURCES_TEXT = "<resources>\n</resources>";
    String RESOURCES_TAG = "resources";
    String DIMEN_TAG = "dimen";
    String MDPI = "mdpi";
    float TITLE_SIZE = 16.0f;
    String NAME_TAG = "name";
    String PLACEHOLDER_DIMEN = "\t<dimen name=\"{0}\">{1}{2}</dimen>\n";
    String FILE_NAME = "dimens.xml";
    String VALUES_PREFIX = "values-";
    String DP = "dp";
    String SP = "sp";
    String TITLE = "Set scale factors for ";
    String BULK_TITLE = "Your scaling factors are";
    String MESSAGES[] = {
            "There are duplicate buckets please fix before adding more."
            , "Custom buckets are restricted to 5"
            , "Could not map the resource folder to a density value"
            , "Could not convert the value into a number"
            , "Could not map xml the file to a density bucket.\n Please check if the source density bucket was added"
    };
    int ERROR_CODE[] = {1, 2};
    String ERROR_TITLE = "Error";
    String SCALE_TEXT_PREFIX = "Please a scale value for ";
    String NEW_BUCKET = "新規変数を追加する";
    String METRIC = " metric";
    String DEFAULT_BUCKET = "sw600dp-land";
    float DEFAULT_SCALE_FACTOR = 1.2f;
    int MAX_DIMENS = 10;

    enum Mode {
        SINGLE,
        BULK;
    }

}
