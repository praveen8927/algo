package bigQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveen on 27/12/16.
 */
public class GsonTest {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(100);
//        list.add(200);
//        StringBuilder builder = new StringBuilder();
//        builder.append("[");
//
//        for(Integer i : list){
//            builder.append("\"").append(i).append("\"").append(",");
//        }
//        builder.deleteCharAt(builder.lastIndexOf(","));
//        builder.append("]");
//        System.out.println(builder);

    String test = "{\"bl_unbillable_installs\":0.0,\"ad_inc_id\":3746472,\"withhold_taxes\":0.0,\"rq_ltv_model_id\":0,\"total_burn\":0.0,\"rq_ltv_pltv_fingerprint\":0.0,\"vqs_count\":0.0,\"volume_discount\":0.0,\"au_position_tier\":1,\"effective_slot_height\":90.0,\"auto_computed_lambda\":0.0,\"request_geo_type\":\"1\",\"integration_direct\":\"s_smaato_spx\",\"fraud_clicks\":0.0,\"third_quartiles\":0.0,\"request_conv_factor\":0.0,\"agency_revenue\":0.0,\"valid_ad_requests\":0.0,\"bc_valid_pings\":0.0,\"other_valid_clicks\":0.0,\"rq_ltv_dataenough\":false,\"bl_inmobi_investment\":0.0,\"rq_geo_region\":\"29104\",\"click\":0.0,\"nofund_revenue\":0.0,\"au_pECPM\":0.0,\"pub_revenue\":0.0,\"request_creative_inc_id\":0,\"bc_fraud_pings\":0.0,\"rq_ltv_user_score_bucketid\":0,\"normal_burn\":0.0,\"rq_ltv_pltv_device\":0.0,\"adgroup_id\":\"1cdcedfc365f4f20b79020a38b44bbcb\",\"gender\":\"u\",\"bl_billed_installs\":0.0,\"rq_passthrough_pay\":false,\"rq_is_derived_site_placement_id\":false,\"au_term_beacons\":0.0,\"request_intg_method\":\"api\",\"request_geo_city\":71504,\"second_quartiles\":0.0,\"cpm_billed_beacons\":0.0,\"rq_target_cpd\":0.0,\"rq_cvr_model_id\":0,\"rq_winning_ecpm_bid\":0.98315,\"rq_geo_stateidlist\":\"[29104]\",\"rq_matched_segment_ids\":\"[2186738, 2595925]\",\"request_slot_id\":11,\"rq_sub_objective_id\":0,\"first_quartiles\":0.0,\"request_selected_uid_type\":\"IDA\",\"bl_data_provider_id\":0,\"rq_geo_cityidlist\":\"[71504, 81003]\",\"io_discount\":0.0,\"bl_data_seller_id\":0,\"page_impressions\":0.0,\"rq_diversity_factor\":0,\"bc_total_pings\":0.0,\"effective_slot_width\":728.0,\"rq_cvr_fingerprint\":0.0,\"rq_api_type\":\"API_3_0\",\"risky_burn\":0.0,\"request_all_uid_type\":\"[IDA, u-id-adt]\",\"rq_is_adgroup_subsidized\":false,\"bl_adgroup_investment\":0.0,\"bc_terminated_pings\":0.0,\"template_id\":0,\"handset_device_id\":72357,\"request_muh\":0.0,\"bc_click_no_pings\":0.0,\"rq_cvr_device\":0.0,\"rq_pltv_count\":0.0,\"media_plays\":0.0,\"imp_ad_format\":\"RICH_BANNER\",\"request_mul\":0.0,\"rq_deal_id\":\"257358\",\"accidental_clicks\":0.0,\"request_slot_served\":11,\"rq_device_modelid\":\"46188\",\"predicted_ecpm\":0.0,\"predicted_clicks\":0.0,\"request_muest\":0.0,\"cl_conv_factor\":0.0,\"valid_page_requests\":0.0,\"creative_width\":0.0,\"non_billable_impressions\":0.0,\"segment_id\":0,\"request_ad_format\":\"json\",\"budget_tier_id\":0,\"served_impressions\":1.0,\"request_intg_version\":\"3.0.0\",\"request_served_dst\":\"IX\",\"terminated_clicks\":0.0,\"au_fraud_beacons\":0.0,\"rq_placement_segment_id\":184708,\"creative_charges\":0.0,\"bl_adserving_cost\":0.0,\"request_ecpm_goalseek\":0.0,\"rq_is_strategic_ad\":false,\"request_system_latlon\":\"14.6,121.0\",\"site_guid\":\"bd8d0b4de06446039550a5b519f2cf2c\",\"rq_nojs_tracking\":false,\"user_lambda\":0.0,\"bl_fund_source_id\":0,\"rq_auction_conv_factor\":0.0,\"rq_resolved_ad_type\":\"BANNER\",\"lambda_used\":0.0,\"adv_account_guid\":\"6016e163eac649398d02bb9d43d865cd\",\"request_mucons\":0.0,\"cl_valid_clicks\":0.0,\"request_req_dst\":\"[0, 7, 8]\",\"rq_site_placement_id\":1456591214504,\"au_position_id\":0,\"is_predicted_cvr_null\":false,\"rq_loc_src\":\"derived-lat-lon\",\"rq_is_secureenabled\":false,\"rq_is_muest_null\":false,\"total_ad_requests\":0.0,\"rq_is_subsidy_impression\":false,\"rq_ltv_target_cpq\":0.0,\"country_carrier_id\":504,\"vqs_sum\":0.0,\"request_time\":0,\"request_mkcpcadserved\":0.0,\"supply_source_type\":\"NETWORK_SUPPLY\",\"au_valid_beacons\":0.0,\"rq_cvr_user_score_bucketid\":0,\"bl_billed_spend\":0.0,\"creative_height\":0.0,\"bl_unbilled_installs\":0.0,\"page_requests\":0.0,\"request_placement_id\":0,\"request_intg_origin\":\"svr\",\"request_fill_dst\":\"[7]\",\"data_enrichment_cost\":0.0,\"au_served\":0.0,\"non_billable_cpc_clicks\":0.0,\"completed_views\":0.0,\"request_intg_family\":\"SPECS\",\"rq_ltv_pltv\":0.0,\"nondiscounted_burn\":0.0,\"custom_ad_unit_id\":0,\"request_is_geo_enabled\":\"true\",\"rq_ltv_target_cpa\":0.0,\"age\":\"INVALID\",\"event_time\":1477519200000,\"participated_impressions\":0.0}\n";

        String test1,test2 = null;
        if(test.contains("rq_matched_segment_ids")){
            test1 = test.replace("rq_matched_segment_ids\":\"","rq_matched_segment_ids\":");
            System.out.println(test);
            test2 = test1.replace("\",\"request_slot_id",",\"request_slot_id");
            System.out.println(test);
        }

        System.out.println(test2);
    }


}
