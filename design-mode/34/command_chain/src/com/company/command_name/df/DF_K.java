package com.company.command_name.df;

import com.company.CommandVO;
import com.company.command_name.os.DiskManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DF_K extends AbstractDF{
	//����һ���Լ��ܴ���ʲô����
	protected String getOperateParam() {
		return super.K_PARAM;
	}
	
	//�����
	protected String echo(CommandVO vo) {
		return DiskManager.df_k();
	}
}