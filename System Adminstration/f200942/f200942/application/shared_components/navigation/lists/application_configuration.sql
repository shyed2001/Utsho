prompt --application/shared_components/navigation/lists/application_configuration
begin
--   Manifest
--     LIST: Application Configuration
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
 p_id=>wwv_flow_imp.id(52608666091568297152)
,p_name=>'Application Configuration'
,p_list_status=>'PUBLIC'
,p_required_patch=>wwv_flow_imp.id(52608366707579296092)
,p_version_scn=>15629546037923
);
wwv_flow_imp_shared.create_list_item(
 p_id=>wwv_flow_imp.id(52608666452526297153)
,p_list_item_display_sequence=>10
,p_list_item_link_text=>'Configuration Options'
,p_list_item_link_target=>'f?p=&APP_ID.:10010:&APP_SESSION.::&DEBUG.:10010::'
,p_list_item_icon=>'fa-sliders'
,p_list_text_01=>'Enable or disable application features'
,p_required_patch=>wwv_flow_imp.id(52608366707579296092)
,p_list_item_current_type=>'TARGET_PAGE'
);
wwv_flow_imp.component_end;
end;
/
