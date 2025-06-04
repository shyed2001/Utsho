prompt --application/shared_components/navigation/lists/user_interface
begin
--   Manifest
--     LIST: User Interface
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
 p_id=>wwv_flow_imp.id(52608666791812297153)
,p_name=>'User Interface'
,p_list_status=>'PUBLIC'
,p_required_patch=>wwv_flow_imp.id(52608367101871296092)
,p_version_scn=>15629546037990
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608667160227297153)
,p_list_item_display_sequence=>10
,p_list_item_link_text=>'Theme Style Selection'
,p_list_item_link_target=>'f?p=&APP_ID.:10020:&APP_SESSION.::&DEBUG.:10020::'
,p_list_item_icon=>'fa-paint-brush'
,p_list_text_01=>'Set the default application look and feel'
,p_required_patch=>wwv_flow_imp.id(52608367101871296092)
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp.component_end;
end;
/
