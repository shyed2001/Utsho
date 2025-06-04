prompt --application/shared_components/logic/build_options
begin
--   Manifest
--     BUILD OPTIONS: 200942
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608361475128296082)
,p_build_option_name=>'Commented Out'
,p_build_option_status=>'EXCLUDE'
,p_version_scn=>15629546018546
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608366355375296092)
,p_build_option_name=>'Feature: Access Control'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018788
,p_feature_identifier=>'APPLICATION_ACCESS_CONTROL'
,p_build_option_comment=>'Incorporate role based user authentication within your application and manage username mappings to application roles.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608366414711296092)
,p_build_option_name=>'Feature: Activity Reporting'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018796
,p_feature_identifier=>'APPLICATION_ACTIVITY_REPORTING'
,p_build_option_comment=>'Include numerous reports and charts on end user activity.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608366591039296092)
,p_build_option_name=>'Feature: Feedback'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018799
,p_feature_identifier=>'APPLICATION_FEEDBACK'
,p_build_option_comment=>'Provide a mechanism for end users to post general comments back to the application administrators and developers.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608366707579296092)
,p_build_option_name=>'Feature: Configuration Options'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018784
,p_feature_identifier=>'APPLICATION_CONFIGURATION'
,p_build_option_comment=>'Allow application administrators to enable or disable specific functionality, associated with an Oracle APEX build option, from within the application.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608367048433296092)
,p_build_option_name=>'Feature: About Page'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018803
,p_feature_identifier=>'APPLICATION_ABOUT_PAGE'
,p_build_option_comment=>'About this application page.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608367101871296092)
,p_build_option_name=>'Feature: Theme Style Selection'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546018804
,p_feature_identifier=>'APPLICATION_THEME_STYLE_SELECTION'
,p_build_option_comment=>'Allow administrators to select a default color scheme (theme style) for the application. Administrators can also choose to allow end users to choose their own theme style. '
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608684345617297175)
,p_build_option_name=>'Feature: Push Notifications'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546038879
,p_feature_identifier=>'APPLICATION_PUSH_NOTIFICATIONS'
,p_build_option_comment=>'Allow users to subscribe to push notifications on their devices.'
);
wwv_flow_imp_shared.create_build_option(
 p_id=>wwv_flow_imp.id(52608684607413297175)
,p_build_option_name=>'Feature: User Settings'
,p_build_option_status=>'INCLUDE'
,p_version_scn=>15629546038889
,p_feature_identifier=>'APPLICATION_USER_SETTINGS'
,p_build_option_comment=>'The user settings page is a drawer that links to all user settings pages.'
);
wwv_flow_imp.component_end;
end;
/
