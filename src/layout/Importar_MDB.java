package layout;

import java.sql.Connection;
import java.sql.Statement;

import consulta.GuiaMedica;
import consulta.GuiaMedicaCons;

public class Importar_MDB {

	private Connection conexao;
	private Statement statement;
	private GuiaMedica gm;
	
	public Importar_MDB(Connection conexao, Statement statement, GuiaMedica gm) {
		
		this.conexao = conexao;
		this.statement = statement;
		this.gm	= gm;
	}	
	
	public String linha_importar_atuarial_mdb(String lnh_input) {
		
		String lnhOutput = "";
		
		RegMdb mdb = new RegMdb();
		
		mdb.setCpo01(lnh_input.substring(0  ,  2));
		mdb.setCpo02(lnh_input.substring(2  , 16));
		mdb.setCpo03(lnh_input.substring(16 , 17));
		mdb.setCpo04(lnh_input.substring(17 , 18));
		mdb.setCpo05(lnh_input.substring(18 , 20));
		mdb.setCpo06(lnh_input.substring(20 , 21));
		mdb.setCpo07(lnh_input.substring(21 , 22));
		mdb.setCpo08(lnh_input.substring(22 , 28));
		mdb.setCpo09(lnh_input.substring(28 , 30));
		mdb.setCpo10(lnh_input.substring(30 , 31));
		mdb.setCpo11(lnh_input.substring(31 , 37));
		mdb.setCpo12(lnh_input.substring(37 , 38));
		mdb.setCpo13(lnh_input.substring(38 , 40));
		mdb.setCpo14(lnh_input.substring(40 , 42));
		mdb.setCpo15(lnh_input.substring(42 , 50));
		mdb.setCpo16(lnh_input.substring(50 , 58));
		mdb.setCpo17(lnh_input.substring(58 , 59));
		mdb.setCpo18(lnh_input.substring(59 , 72));
		mdb.setCpo19(lnh_input.substring(72 , 76));
		mdb.setCpo20(lnh_input.substring(76 , 88));
		mdb.setCpo21(lnh_input.substring(88 , 91));
		mdb.setCpo22(lnh_input.substring(91 ,103));
		mdb.setCpo23(lnh_input.substring(103,115));
		mdb.setCpo24(lnh_input.substring(115,116));
		mdb.setCpo25(lnh_input.substring(116,118));
		mdb.setCpo26(lnh_input.substring(118,130));
		mdb.setCpo27(lnh_input.substring(130,132));
		mdb.setCpo28(lnh_input.substring(132,133));
		mdb.setCpo29(lnh_input.substring(133,140));
		mdb.setCpo30(lnh_input.substring(140,150));
		mdb.setCpo31(lnh_input.substring(150,160));
		mdb.setCpo32(lnh_input.substring(160,162));
		mdb.setCpo33(lnh_input.substring(162,168));
		mdb.setCpo34(lnh_input.substring(168,170));
		mdb.setCpo35(lnh_input.substring(170,180));
		mdb.setCpo36(lnh_input.substring(180,182));
		mdb.setCpo37(lnh_input.substring(182,183));
		mdb.setCpo38(lnh_input.substring(183,185));
		mdb.setCpo39(lnh_input.substring(185,197));
		mdb.setCpo40(lnh_input.substring(197,209));
		mdb.setCpo41(lnh_input.substring(209,211));
		mdb.setCpo42(lnh_input.substring(211,212));
		mdb.setCpo43(lnh_input.substring(212,213));
		mdb.setCpo44(lnh_input.substring(213,214));
		mdb.setCpo45(lnh_input.substring(214,274));
		mdb.setCpo46(lnh_input.substring(274,275));
		mdb.setCpo47(lnh_input.substring(275,276));
		mdb.setCpo48(lnh_input.substring(276,277));
		mdb.setCpo49(lnh_input.substring(277,278));
		mdb.setCpo50(lnh_input.substring(278,279));
		mdb.setCpo51(lnh_input.substring(279,289));
		mdb.setCpo52(lnh_input.substring(289,299));
		mdb.setCpo53(lnh_input.substring(299,300));
		mdb.setCpo54(lnh_input.substring(300,301));
		mdb.setCpo55(lnh_input.substring(301,325));
		mdb.setCpo56(lnh_input.substring(325,326));
		mdb.setCpo57(lnh_input.substring(326,327));
		mdb.setCpo58(lnh_input.substring(327,333));
		mdb.setCpo59(lnh_input.substring(333,341));
		mdb.setCpo60(lnh_input.substring(341,349));
		mdb.setCpo61(lnh_input.substring(349,359));
		mdb.setCpo62(lnh_input.substring(359,367));
		mdb.setCpo63(lnh_input.substring(367,373));
		mdb.setCpo64(lnh_input.substring(373,375));
		mdb.setCpo65(lnh_input.substring(375,381));
		mdb.setCpo66(lnh_input.substring(381,386));
		mdb.setCpo67(lnh_input.substring(386,418));
		mdb.setCpo68(lnh_input.substring(418,443));
		mdb.setCpo69(lnh_input.substring(443,445));
		mdb.setCpo70(lnh_input.substring(445,450));
		mdb.setCpo71(lnh_input.substring(450,464));
		mdb.setCpo72(lnh_input.substring(464,474));
		mdb.setCpo73(lnh_input.substring(474,475));
		mdb.setCpo74(lnh_input.substring(475,485));
		mdb.setCpo75(lnh_input.substring(485,495));
		mdb.setCpo76(lnh_input.substring(495,505));
		mdb.setCpo77(lnh_input.substring(505,508));
		mdb.setCpo78(lnh_input.substring(508,511));
		mdb.setCpo79(lnh_input.substring(511,523));
		mdb.setCpo80(lnh_input.substring(523,526));
		mdb.setCpo81(lnh_input.substring(526,528));
		mdb.setCpo82(lnh_input.substring(528,530));
		mdb.setCpo83(lnh_input.substring(530,536));
		mdb.setCpo84(lnh_input.substring(536,566));
		mdb.setCpo85(lnh_input.substring(566,591));
		mdb.setCpo86(lnh_input.substring(591,606));
		mdb.setCpo87(lnh_input.substring(606,620));
		mdb.setCpo88(lnh_input.substring(620,634));
		mdb.setCpo89(lnh_input.substring(634,649));
		mdb.setCpo90(lnh_input.substring(649,664));
		mdb.setCpo91(lnh_input.substring(664,679));
		mdb.setCpo92(lnh_input.substring(679,693));
			                                
			                                
			                                
			                                
		mdb.setCpo93(lnh_input.substring(693,706));
		mdb.setCpo94(lnh_input.substring(706,708));
			                                
			                                
		mdb.setCpo95(lnh_input.substring(708,718));
		mdb.setCpo96(lnh_input.substring(718,778));
		mdb.setCpo97(lnh_input.substring(778,784));
		mdb.setCpo98(lnh_input.substring(784,834) + "          ");
		//mdb.setCpo99(lnh_input.substring(834,839));


		gm.setPespmatr_08(lnh_input.substring(22, 28));
		gm.setPespmato_65(lnh_input.substring(375, 381));
		gm.setExtra_01("");
		
		GuiaMedicaCons consGuia = new GuiaMedicaCons(conexao, statement);
		consGuia.getDadosMatriculasCortadas(lnh_input.substring(466, 474), gm);
		
		lnhOutput = 
					mdb.getCpo01() + 
					mdb.getCpo02() + 
					mdb.getCpo03() + 
					mdb.getCpo04() + 
					mdb.getCpo05() + 
					mdb.getCpo06() + 
					mdb.getCpo07() + 
					gm.getPespmatr_08()		+ 
					mdb.getCpo09() + 
					mdb.getCpo10() + 
					mdb.getCpo11() + 
					mdb.getCpo12() + 
					mdb.getCpo13() + 
					mdb.getCpo14() + 
					mdb.getCpo15() + 
					mdb.getCpo16() + 
					mdb.getCpo17() + 
					mdb.getCpo18() + 
					mdb.getCpo19() + 
					mdb.getCpo20() + 
					mdb.getCpo21() + 
					mdb.getCpo22() + 
					mdb.getCpo23() + 
					mdb.getCpo24() + 
					mdb.getCpo25() + 
					mdb.getCpo26() + 
					mdb.getCpo27() + 
					mdb.getCpo28() + 
					mdb.getCpo29() + 
					mdb.getCpo30() + 
					mdb.getCpo31() + 
					mdb.getCpo32() + 
					mdb.getCpo33() + 
					mdb.getCpo34() + 
					mdb.getCpo35() + 
					mdb.getCpo36() + 
					mdb.getCpo37() + 
					mdb.getCpo38() + 
					mdb.getCpo39() + 
					mdb.getCpo40() + 
					mdb.getCpo41() + 
					mdb.getCpo42() + 
					mdb.getCpo43() + 
					mdb.getCpo44() + 
					mdb.getCpo45() + 
					mdb.getCpo46() + 
					mdb.getCpo47() + 
					mdb.getCpo48() + 
					mdb.getCpo49() + 
					mdb.getCpo50() + 
					mdb.getCpo51() + 
					mdb.getCpo52() + 
					mdb.getCpo53() + 
					mdb.getCpo54() + 
					mdb.getCpo55() + 
					mdb.getCpo56() + 
					mdb.getCpo57() + 
					mdb.getCpo58() + 
					mdb.getCpo59() + 
					mdb.getCpo60() + 
					mdb.getCpo61() + 
					mdb.getCpo62() + 
					mdb.getCpo63() + 
					mdb.getCpo64() + 
					gm.getPespmato_65()		+ 
					mdb.getCpo66() + 
					mdb.getCpo67() + 
					mdb.getCpo68() + 
					mdb.getCpo69() + 
					mdb.getCpo70() + 
					mdb.getCpo71() + 
					mdb.getCpo72() + 
					mdb.getCpo73() + 
					mdb.getCpo74() + 
					mdb.getCpo75() + 
					mdb.getCpo76() + 
					mdb.getCpo77() + 
					mdb.getCpo78() + 
					mdb.getCpo79() + 
					mdb.getCpo80() + 
					mdb.getCpo81() + 
					mdb.getCpo82() + 
					mdb.getCpo83() + 
					mdb.getCpo84() + 
					mdb.getCpo85() + 
					mdb.getCpo86() + 
					mdb.getCpo87() + 
					mdb.getCpo88() + 
					mdb.getCpo89() + 
					mdb.getCpo90() + 
					mdb.getCpo91() + 
					mdb.getCpo92() + 
					mdb.getCpo93() + 
					mdb.getCpo94() + 
					mdb.getCpo95() + 
					mdb.getCpo96() + 
					mdb.getCpo97() + 
					mdb.getCpo98() + 
					gm.getExtra_01(); 
		
		return lnhOutput;
	}	
	
}
