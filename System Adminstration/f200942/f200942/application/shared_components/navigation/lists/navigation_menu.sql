prompt --application/shared_components/navigation/lists/navigation_menu
begin
--   Manifest
--     LIST: Navigation Menu
--   Manifest End
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_list(
 p_id=>wwv_flow_imp.id(52608362506319296084)
,p_name=>'Navigation Menu'
,p_list_status=>'PUBLIC'
,p_version_scn=>15629546037746
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608379931211296113)
,p_list_item_display_sequence=>10
,p_list_item_link_text=>'Home'
,p_list_item_link_target=>'f?p=&APP_ID.:1:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-home'
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608381451876296116)
,p_list_item_display_sequence=>20
,p_list_item_link_text=>'Dashboard'
,p_list_item_link_target=>'f?p=&APP_ID.:2:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-dashboard'
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608393932960296127)
,p_list_item_display_sequence=>30
,p_list_item_link_text=>'Tmdb5000b Search'
,p_list_item_link_target=>'f?p=&APP_ID.:3:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-table-search'
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608408006983296153)
,p_list_item_display_sequence=>40
,p_list_item_link_text=>'Tmdb5000b Report'
,p_list_item_link_target=>'f?p=&APP_ID.:4:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-table'
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608445409647296901)
,p_list_item_display_sequence=>50
,p_list_item_link_text=>'Calendar'
,p_list_item_link_target=>'f?p=&APP_ID.:6:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-calendar-o'
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608664939340297151)
,p_list_item_display_sequence=>10000
,p_list_item_link_text=>'Administration'
,p_list_item_link_target=>'f?p=&APP_ID.:10000:&APP_SESSION.::&DEBUG.:::'
,p_list_item_icon=>'fa-user-wrench'
,p_security_scheme=>wwv_flow_imp.id(52608369196213296096)
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp.component_end;
end;
/
