package com.example.lazyload;

import java.util.ArrayList;

public class ConstantVariable {
    public final static String BASE_URL = "http://ess.technitab.in/";
    public final static String BASE_TEST_URL = "http://staging.ess.technitab.in/";
    public static final String BASE_FIX_ASSET_URL = BASE_URL + "fix_asset/";
    public static final String BASE_TEC_URL = BASE_URL + "tec/";
    public static final String CHANNEL_ID = "ESS";
    public static final String CHANNEL_NAME = "Employee Self Service";
    public static final String CHANNEL_DESCRIPTION = "www.technitab.in";
    public static final String REQUEST_LEAVE = "request_leave";
    public static final String LEAVE_APPROVED = "leave approved";
    public static final String LEAVE_REJECTED = "leave rejected";
    public static final String TEC_ = "tec";
    public static final String LEAVE_CANCEL = "cancel leave";
    public static final String LIST = "list";
    public static final String TRIP_BOOKINGS = "trip_bookings";
    public static final String BOOKING_JSON = "booking_json";
    public static final String PAYMENT_JSON = "payment_json";
    public static final String REQUEST = "request";


    public static class UserPrefVar {
        public static final String USER_FILE = "user_file";
        public static final String USER_ID = "user_id";
        public static final String USER_ROLE = "user_role";
        public static final String NAME = "name";
        public static final String EMAIL = "email";
        public static final String NUMBER = "mobile_number";
        public static final String IS_LOGIN = "is_login";
        public static final String ROLE_ID = "role_id";
        public static final String ACCESS_CONTROL_ID = "access_control_id";
        public static final String FCM_TOKEN = "fcm_token";
        public static final String RELATED_TABLE = "related_table";
        public static final String BASE_OFFICE_LOCATION = "base_office_location";
    }


    public static class Tbl_Task {
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String IS_DONE = "is_done";
        public static final String DATE = "created_date";
    }

    public static class Tbl_Attendance {
        public static final String ID = "id";
        public static final String DATE = "date";
        public static final String ATTENDANCE = "attendance";
        public static final String PUNCH_IN = "punch_in";
        public static final String PUNCH_OUT = "punch_out";
        public static final String MANUAL_PUNCH_IN = "manual_punch_in";
        public static final String MANUAL_PUNCH_OUT = "manual_punch_out";
        public static final String MANUAL_PUNCH_SYS_IN = "manual_punch_sys_in";
        public static final String MANUAL_PUNCH_SYS_OUT = "manual_punch_sys_out";
        public static final String SPENT_TIME = "spent_time";
        public static final String IN_PHOTO_PATH = "in_photo_path";
        public static final String OUT_PHOTO_PATH = "out_photo_path";
        public static final String IN_ADDRESS = "in_address";
        public static final String OUT_ADDRESS = "out_address";
        public static final String IN_LOCATION = "in_location";
        public static final String OUT_LOCATION = "out_location";
        public static final String SUMMERY = "summery";
        public static final String PUNCH_STATUS = "punch_status";
        public static final String MONTH_YEAR = "month_year";
        public static final String TIMESHEET_HOURS = "timesheet_hours";
        public static final String SYNC_STATUS = "sync_status";
    }


    public static class Tbl_LEAVE {
        public static final String ID = "id";
        public static final String REQUESTED_DATE = "requested_date";
        public static final String START_DATE = "start_date";
        public static final String END_DATE = "end_date";
        public static final String START_DATE_LEAVE_TYPE = "start_date_leave_type";
        public static final String END_DATE_LEAVE_TYPE = "end_date_leave_type";
        public static final String DESCRIPTION = "description";
        public static final String REASON = "reason";
        public static final String LEAVE_LOCATION = "leave_location";
        public static final String STATUS = "status";
    }

    public static class Location {

        public static final int SUCCESS_RESULT = 0;
        public static final int FAILURE_RESULT = 1;
        public static final String PACKAGE_NAME = "in.technitab.ess";
        public static final String RECEIVER = PACKAGE_NAME + ".RECEIVER";
        public static final String RESULT_DATA_KEY = PACKAGE_NAME + ".RESULT_DATA_KEY";
        public static final String LOCATION_DATA_EXTRA = PACKAGE_NAME + ".LOCATION_DATA_EXTRA";
        public static final String LOCATION = "location";
        public static final String LOCATION_ADDRESS = "location_address";
    }

    public static class Tec {
        public static final String ID = "id";
        public static final String PROJECT_ID = "project_id";
        public static final String CLAIM_START_DATE = "claim_start_date";
        public static final String CLAIM_END_DATE = "claim_end_date";
        public static final String BASE_LOCATION = "base_location";
        public static final String SITE_LOCATION = "site_location";
        public static final String STATUS = "status";
        public static final String TOTAL_AMOUNT = "total_amount";
        public static final String DESCRIPTION = "description";
        public static final String CREATED_BY_ID = "created_by_id";
        public static final String PROJECT_NAME = "project_name";
        public static final String CREATED_DATE = "created_date";
        public static final String USER_NOTE = "user_note";
        public static final String SUBMIT_BY_ID = "submit_by_id";
        public static final String MODIFIED_BY_ID = "modified_by_id";
        public static final String MODIFIED_DATE = "modified_date";
        public static final String SUBMIT_DATE = "submit_date";
        public static final String REMARK = "remark";
        public static final String BOOKING_ID = "booking_id";
        public static final String PAYMENT_ID = "payment_id";
        public static final String TEC_ID = "tec_id";
        public static final String ENTRY_CATEGORY = "entry_category";
        public static final String TRAVEL_MODE = "travel_mode";
        public static final String DEPARTURE_DATE = "deprt_date";
        public static final String DEPARTURE_TIME = "deprt_time";
        public static final String ARRIVAL_DATE = "arrival_date";
        public static final String ARRIVAL_TIME = "arrival_time";
        public static final String LOCATION = "location";
        public static final String FROM_LOCATION = "from_location";
        public static final String TO_LOCATION = "to_location";
        public static final String KILO_METER = "kilo_meter";
        public static final String MILEAGE = "mileage";
        public static final String UNIT_PRICE = "unit_price";
        public static final String VENDOR = "vendor";
        public static final String TOTAL_QUANTITTY = "total_quantitty";
        public static final String NON_WORKING_DAYS = "Non_working_days";
        public static final String DATE = "date";
        public static final String PAID_TO = "paid_to";
        public static final String PAID_BY = "paid_by";
        public static final String GSTIN = "gstin";
        public static final String BILL_AMOUNT = "bill_amount";
        public static final String BILL_NUM = "bill_num";
        public static final String ATTACHMENT_PATH = "attachment_path";
        public static final String ENTRY_ID = "entry_id";
        public static final String TRAVEL_DATE = "travel_date";
        public static final String CLAIM_DATE = "claim_date";
        public static final String CITY_VALUE = "is_metro";
        public static final String IS_BILLABLE = "is_billable";
        public static final String PAID_TO_ID = "paid_to_id";
        public static final String IS_INTERNATIONAL = "is_international";
        public static final String TEC_JSON = "tec_json";
        public static final String TRIP_ID = "trip_id";
    }

    public static class Trip {
        public static final String TRIP_ID = "id";
        public static final String PROJECT_ID = "project_id";
        public static final String PROJECT_NAME = "project_name";
        public static final String SOURCE = "source";
        public static final String DESTINATION = "destination";
        public static final String START_DATE = "start_date";
        public static final String MEMBER_JSON = "member_json";
        public static final String STATUS = "status";
        public static final String REMARK = "remark";
        public static final String COMMENT = "comment";
        public static final String CREATED_DATE = "created_date";
        public static final String CREATED_BY_ID = "created_by_id";
        public static final String CREATED_BY = "created_by";
        public static final String END_DATE = "end_date";
    }

    public static class TripBooking {
        public final static String ID = "id";
        public final static String TRIP_ID = "trip_id";
        public final static String TRAVEL_TYPE = "travel_type";
        public final static String USER_BOOKING_MODE = "user_booking_mode";
        public final static String USER_RATE = "user_rate";
        public final static String USER_CITY_AREA = "user_city_area";
        public final static String USER_VENDOR = "user_vendor";
        public final static String USER_SOURCE = "user_source";
        public final static String USER_VENDOR_ID = "user_vendor_id";
        public final static String USER_DESTINATION = "user_destination";
        public final static String USER_TRAVEL_DATE = "user_travel_date";
        public final static String USER_INSTRUCTION = "user_instruction";
        public final static String USER_CHECK_IN = "user_check_in";
        public final static String USER_CHECK_OUT = "user_check_out";
        public final static String USER_ROOM = "user_room";
        public final static String USER_TOTAL_AMOUNT = "user_total_amount";
        public final static String ADMIN_BOOKING_MODE = "admin_booking_mode";
        public final static String ADMIN_CITY_AREA = "admin_city_area";
        public final static String ADMIN_VENDOR = "admin_vendor";
        public final static String ADMIN_VENDOR_ID = "admin_vendor_id";
        public final static String ADMIN_SOURCE = "admin_source";
        public final static String ADMIN_DESTINATION = "admin_destination";
        public final static String ADMIN_INSTRUCTION = "admin_instruction";
        public final static String ADMIN_CHECK_IN = "admin_check_in";
        public final static String ADMIN_CHECK_OUT = "admin_check_out";
        public final static String ADMIN_ROOM = "admin_room";
        public final static String ADMIN_TOTAL_AMOUNT = "admin_total_amount";
        public final static String ADMIN_DEPARTURE_DATE_TIME = "admin_departure_date_time";
        public final static String ADMIN_ARRIVAL_DATE_TIME = "admin_arrival_date_time";
        public final static String TAX_NAME = "tax_name";
        public final static String TAX_AMOUNT = "tax_amount";
        public final static String TAX_TYPE = "tax_type";
        public final static String SERVICE_TAX_NAME = "service_tax_name";
        public final static String SERVICE_TAX_PERCENT = "service_tax_percent";
        public final static String SERVICE_TAX_AMOUNT = "service_tax_amount";
        public final static String SERVICE_TAX_TYPE = "service_tax_type";
        public final static String TOTAL_AMOUNT = "total_amount";
        public final static String ADMIN_BOOKING_ATTACHMENT = "admin_booking_attachment";
        public final static String TRIP_BOOKING_MEMBER = "trip_booking_member";
        public final static String TRIP_STATUS = "trip_status";
        public final static String CREATED_BY_ID = "created_by_id";
        public final static String CREATED_DATE = "created_date";
        public final static String MODIFIED_BY_ID = "modified_by_id";
        public final static String MODIFIED_DATE = "modified_date";
        public final static String BILL_DATE = "Bill Date";
        public final static String BILL_ID = "Bill ID";
        public final static String BILL_NUMBER = "Bill Number";
        public final static String PURCHASE_ORDER = "PurchaseOrder";
        public final static String BILL_STATUS = "Bill Status";
        public final static String DESTINATION_OF_SUPPLY = "Destination of Supply";
        public final static String GST_TEATMENT = "GST Treatment";
        public final static String GST_NUM = "GST Identification Number (GSTIN)";
        public final static String VENDOR_NAME = "Vendor Name";
        public final static String DUE_DATE = "Due Date";
        public final static String CURRENCY_CODE = "Currency Code";
        public final static String ITEM_NAME = "Item Name";
        public final static String ACCOUNT = "Account";
        public final static String ITEM_DESCRIPTION = "Item Description";
        public final static String QUANTITY = "quantity";
        public final static String USAGE_UNIT = "Usage unit";
        public final static String RATE = "rate";
        public final static String TAX_PERCENTAGE = "Tax Percentage";
        public final static String ITEM_TOTAL = "Item Total";
        public final static String SUB_TOTAL = "SubTotal";
        public final static String TOTAL = "Total";
        public final static String PROJECT_NAME = "Project Name";
        public static final String BOOKING_REQUESTED_STATUS = "Booking Requested";
        public static final String BOOKING_DONE_STATUS = "Booking Done";
        public static final String PAYMENT_REQUESTED_STATUS = "Payment Requested";
        public static final String PAYMENT_DONE_STATUS = "PAYMENT Done";
        public static final String CANCELLATION_REQUESTED_STATUS = "Cancellation Requested";
        public static final String CANCELLATION_DONE_STATUS = "Cancellation Done";
        public static final String CREATE_BY = "created_by";
        public static final String PAYMENT_ID = "payment_id";
        public static final String PAID_BY = "paid_by";
    }



    public static class Booking {
        public static final String BOOKING_MODE = "booking_mode";
        public static final String TRAVEL_TYPE = "travel_type";

    }

    public class MIX_ID {
        public static final String VIEW_TYPE = "view_type";
        public static final String MONTH = "month";
        public static final String YEAR = "year";
        public static final String ACTION_VIEW_TYPE = "action_view_type";
        public static final String CREATED_BY_ID = "created_by_id";
        public static final String ACTION = "action";
        public static final String ADD = "add";
        public static final String VIEW = "view";
        public static final String VENDOR = "vendor";
        public static final String ID = "id";
        public static final String PROJECT_ID = "project_id";
        public static final String APPROVE = "approve";
        public static final String SUBMIT = "submit";
        public static final String UPDATE = "update";
        public static final String HEADER_POSITION = "header_position";
        public static final String TITLE = "title";
        public static final String TRIP = "trip";
        public static final String VALUE = "value";
        public static final String DELETE = "delete";
        public static final String INSERT = "insert";
        public static final String BOOKING_ID = "booking_id";
        public static final String MODIFIED_BY_ID = "modified_by_id";
        public static final String USER_NAME = "user_name";
        public static final String PROJECT_ACTIVITY = "project_activity";
        public static final String PROJECT = "project";
    }

    public class Timesheet {
        public static final String STAFF_NAME = "staff_name";
        public static final String DATE = "date";
        public static final String PROJECT_JSON = "project_json";
    }

    public class Tbl_TimeSheet {
        public static final String PROJECT_ID = "project_id";
        public static final String DATE = "date";
        public static final String ACTIVITY_TYPE_ID = "activity_type_id";
        public static final String PROJECT = "project";
        public static final String ACTIVITY = "activity";
        public static final String TIME_SPENT = "time_spent";
        public static final String DESCRIPTION = "description";
        public static final String PROJECT_TYPE_ID = "project_type_id";
        public static final String ACTIVITY_ID = "activity_id";
        public static final String IS_BILLABLE = "is_billable";
    }

    public class Project {
        public static final String ID = "id";
        public static final String PROJECT_NAME = "project_name";
        public static final String PROJECT_TYPE_ID = "project_type_id";
        public static final String SITE_LOCATION = "site_location";
        public static final String STATE = "state";
        public static final String DISTRICT = "district";
        public static final String COUNTRY = "country";
        public static final String CUSTOMER_ID = "cust_id";
        public static final String CLIENT_NAME = "client_name";
    }

    public class UserProfile {
        public static final String NAME = "name";
        public static final String DESIGNATION = "designation";
        public static final String EMERGENCY_NUMBER = "emergency_number";
        public static final String MOBILE_NUMBER = "mobile_number";
        public static final String OFFICIAL_EMAIL_ID = "official_email_id";
        public static final String PERSONAL_EMAIL_ID = "personal_email_id";
        public static final String CURRENT_FULL_ADDRES = "current_full_addres";
        public static final String PERMANENT_FULL_ADDRESS = "permanent_full_address";
        public static final String BLOOD_GROUP = "blood_group";
        public static final String BIRTH_DATE = "birth_date";
        public static final String MARITAL_STATUS = "marital_status";
        public static final String MARRIAGE_DATE = "marriage_date";
        public static final String FATHER = "father";
        public static final String SPOUSE = "spouse";
        public static final String NATIONALITY = "nationality";
        public static final String RELIGION = "religion";
        public static final String GENDER = "gender";
        public static final String BASE_OFFICE_LOCATION = "base_office_location";
        public static final String REPORTING_TO = "reporting_to";
        public static final String JOINING_DATE = "joining_date";
        public static final String APPOINTMENT_DATE = "appointment_date";
        public static final String PAN_NUMBER = "pan_number";
        public static final String PASSPORT_NUMBER = "passport_number";
        public static final String AADHAR_NUMBER = "aadhar_number";
        public static final String DRIVING_LICENSE_NUMBER = "driving_license_number";
        public static final String VOTER_ID_NUMBER = "voter_id_number";
        public static final String BANK_NAME = "bank_name";
        public static final String BANK_ADDRESS = "bank_address";
        public static final String ACCOUNT_NUMER = "account_numer";
        public static final String IFSC_CODE = "ifsc_code";
        public static final String TENTH_YEAR = "10th_year";
        public static final String TENTH_SCHOOL = "10th_school";
        public static final String TENTH_BOARD = "10th_board";
        public static final String TENTH_PERCENTAGE = "10th_percentage";
        public static final String TWELVE_YEAR = "12th_year";
        public static final String TWELVE_SCHOOL = "12th_school";
        public static final String TWELVE_BOARD = "12th_board";
        public static final String TWELVE_PERCENTAGE = "12th_percentage";
        public static final String DIPLOMA_YEAR = "diploma_year";
        public static final String DIPLOMA_SCHOOL = "diploma_school";
        public static final String DIPLOMA_BOARD = "diploma_board";
        public static final String DIPLOMA_PERCENTAGE = "diploma_percentage";
        public static final String GRAD_YEAR = "grad_year";
        public static final String GRAD_SCHOOL = "grad_school";
        public static final String GRAD_BOARD = "grad_board";
        public static final String GRAD_PERCENTAGE = "grad_percentage";
        public static final String POST_GRAD_YEAR = "post_grad_year";
        public static final String POST_GRAD_SCHOOL = "post_grad_school";
        public static final String POST_GRAD_BOARD = "post_grad_board";
        public static final String POST_GRAD_PERCENTAGE = "post_grad_percentage";
    }

    public class Vendor {
        public static final String DISTRICT = "district";
        public static final String CONTACT_NAME = "contact_name";
        public static final String DISPLAY_NAME = "display_name";
        public static final String RATE = "rate";
    }

    public class RequestedProject {
        public static final String ID = "id";
        public static final String PROJECT_ID = "project_id";
        public static final String PROJECT_NAME = "project_name";
        public static final String PROJECT_TYPE_ID = "project_type_id";
        public static final String CREATED_BY = "created_by";
        public static final String CREATED_BY_ID = "created_by_id";
    }

    public class FixAsset {
        public static final String ORG_UNIT_ASSET = "org_unit_asset";
        public static final String ORG_UNIT_ASSET_ID = "org_unit_asset_id";
        public static final String REMARK = "remark";
    }
}
