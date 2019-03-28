package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class MailServer {
	
	//���͵����ķ��ʼ�
	protected final MailTemplate m;
	
	public MailServer(MailTemplate _m){
		this.m  = _m;
	}
	
	//�����ʼ�
	public void sendMail(){
		System.out.println("====���ڷ��͵��ʼ���Ϣ====");
		//������
		System.out.println("�����ˣ�" + m.getFrom());
		//�ռ���
		System.out.println("�ռ��ˣ�" + m.getTo());
		//����
		System.out.println("�ʼ����⣺" + m.getSubject() );
		//�ʼ�����
		System.out.println("�ʼ����ݣ�" + m.getContext());
	}
}