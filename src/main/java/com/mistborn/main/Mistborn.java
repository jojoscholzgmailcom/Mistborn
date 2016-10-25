package com.mistborn.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

import com.mistborn.entity.EntityMain;
import com.mistborn.entity.EntityOberHerr;
import com.mistborn.items.atium;
import com.mistborn.items.bendalloy;
import com.mistborn.items.bronze;
import com.mistborn.items.cadmium;
import com.mistborn.items.clipser;
import com.mistborn.items.duralomin;
import com.mistborn.items.eisdolch;
import com.mistborn.items.eisschwert;
import com.mistborn.items.glasdolch;
import com.mistborn.items.glasschwert;
import com.mistborn.items.gnebel;
import com.mistborn.items.holzstab;
import com.mistborn.items.krypton;
import com.mistborn.items.kupfer;
import com.mistborn.items.messing;
import com.mistborn.items.nebel_ingot;
import com.mistborn.items.nebel_nugget;
import com.mistborn.items.nebeldolch;
import com.mistborn.items.nebelschwert;
import com.mistborn.items.nebelstoff;
import com.mistborn.items.obsidiandolch;
import com.mistborn.items.obsidianschwert;
import com.mistborn.items.ragonium;
import com.mistborn.items.rohernebel;
import com.mistborn.items.stahl;
import com.mistborn.items.vnebel;
import com.mistborn.items.zehnerclipser;
import com.mistborn.items.zink;
import com.mistborn.items.zinn;
import com.mistborn.render.RenderOberHerr;
import com.mistborn.tabs.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Mistborn.MODID, version = Mistborn.VERSION)
public class Mistborn
{
    public static final String MODID = "mistborn";
    public static final String VERSION = "7.0";
    
    @SidedProxy(clientSide = "com.mistborn.main.ClientProxy", serverSide = "com.mistborn.main.ServerProxy")
    public static ServerProxy proxy;
    @Instance(MODID)
    public static Mistborn modInstance;
    
    @Metadata
    public static ModMetadata meta;
    
    public static ToolMaterial enumToolMaterialTest = EnumHelper.addToolMaterial("Glas", 3, 100, 100.0F, 1.0F, 100);
    public static ToolMaterial enumToolMaterial = EnumHelper.addToolMaterial("Obsidian", 10, 10000, 800.0F, 4.0F, 100);
    public static ToolMaterial ToolMaterial = EnumHelper.addToolMaterial("Allumanti", 10, 1, 800.0F, 0.0F, 0);
    public static ArmorMaterial NebelMaterial = EnumHelper.addArmorMaterial("Nebel", 5000, new int[] {1,7,1,1},100);
    public static ToolMaterial Nebel = EnumHelper.addToolMaterial("Nebel", 5, 5000, 400.0F, 2.0F, 500);
    public static ToolMaterial Holz = EnumHelper.addToolMaterial("Holz", 2, 500, 400.0F, 3.5F, 500);
    public static ToolMaterial Eis = EnumHelper.addToolMaterial("Eis", 2, 1000, 400.0F, 0.8F, 500);
    
    
    //Items
    public static Item clipser;
    int clipserID = 700;
    public static Item gulde;
    int guldeID = 701;
    public static Item zehnerclipser;
    int zehnerclipserID = 702;
    public static Item kastling;
    int kastlingID = 703;
    public static Item glasdolch;
    int glasdolchID = 704;
    public static Item obsidiandolch;
    int obsidiandolchID = 705;
    public static Item weisblech;
    int weisblechID = 706;
    public static Item zinn;
    int zinnID = 707;
    public static Item stahl;
    int stahlID = 708;
    public static Item kupfer;
    int kupferID = 709;
    public static Item bronze;
    int bronzeID = 710;
    public static Item messing;
    int messingID = 711;
    public static Item zink;
    int zinkID = 712;
    public static Item bendalloy;
    int bendalloyID = 713;
    public static Item cadmium;
    int cadmiumID = 714;
    public static Item duralomin;
    int duralominID = 715;
    public static Item krypton;
    int kryptonID = 716;
    public static Item ragonium;
    int ragoniumID = 717;
    public static Item atium;
    int atiumID = 718;
    public static Item uweisblech;
    int uweisblechID = 806;
    public static Item uzinn;
    int uzinnID = 807;
    public static Item ustahl;
    int ustahlID = 808;
    public static Item ukupfer;
    int ukupferID = 809;
    public static Item ubronze;
    int ubronzeID = 810;
    public static Item umessing;
    int umessingID = 811;
    public static Item uzink;
    int uzinkID = 812;
    public static Item ubendalloy;
    int ubendalloyID = 813;
    public static Item ucadmium;
    int ucadmiumID = 814;
    public static Item uduralomin;
    int uduralominID = 815;
    public static Item ukrypton;
    int ukryptonID = 816;
    public static Item uragonium;
    int uragoniumID = 817;
    public static Item uatium;
    int uatiumID = 818;
    public static Item uuweisblech;
    int uuweisblechID = 756;
    public static Item uuzinn;
    int uuzinnID = 757;
    public static Item uustahl;
    int uustahlID = 758;
    public static Item uukupfer;
    int uukupferID = 759;
    public static Item uubronze;
    int uubronzeID = 760;
    public static Item uumessing;
    int uumessingID = 761;
    public static Item uuzink;
    int uuzinkID = 762;
    public static Item uubendalloy;
    int uubendalloyID = 763;
    public static Item uucadmium;
    int uucadmiumID = 764;
    public static Item uuduralomin;
    int uuduralominID = 765;
    public static Item uukrypton;
    int uukryptonID = 766;
    public static Item uuragonium;
    int uuragoniumID = 767;
    public static Item uuatium;
    int uuatiumID = 768;
    public static Item uuuweisblech;
    int uuuweisblechID = 866;
    public static Item uuuzinn;
    int uuuzinnID = 867;
    public static Item uuustahl;
    int uuustahlID = 868;
    public static Item uuukupfer;
    int uuukupferID = 869;
    public static Item uuubronze;
    int uuubronzeID = 860;
    public static Item uuumessing;
    int uuumessingID = 871;
    public static Item uuuzink;
    int uuuzinkID = 872;
    public static Item uuubendalloy;
    int uuubendalloyID = 873;
    public static Item uuucadmium;
    int uuucadmiumID = 874;
    public static Item uuuduralomin;
    int uuuduralominID = 875;
    public static Item uuukrypton;
    int uuukryptonID = 876;
    public static Item uuuragonium;
    int uuuragoniumID = 877;
    public static Item uuuatium;
    int uuuatiumID = 878;
    public static Item nebeldolch;
    int nebeldolchID = 879;
    public static Item holzstab;
    int holzstabID = 880;
    public static Item nebelschwert;
    int nebelschwertID = 882;
    public static Item nebel_nugget;
    int nebel_nuggetID = 883;
    public static Item nebel_ingot;
    int nebel_ingotID = 884;
    public static Item rohernebel;
    int rohernebelID = 885;
    public static Item nebelstoff;
    int nebelstoffID = 886;
    public static Item vnebel;
    int vnebelID = 887;
    public static Item gnebel;
    int gnebelID = 888;
    public static Item brei;
    int breiID = 889;
    public static Item suppe;
    int suppeID = 890;
    public static Item kase;
    int kaseID = 891;
    public static Item traube;
    int traubeID = 892;
    public static Item skase;
    int skaseID = 893;
    public static Item sskase;
    int sskaseID = 894;
    public static Item rtraube;
    int rtraubeID = 895;
    public static Item obsidianschwert;
    int obsidianschwertID = 896; 
    public static Item glasschwert;
    int glasschwertID = 897;
    public static Item eisschwert;
    int eisschwertID = 898;
    public static Item eisdolch;
    int eisdolchID = 899;
    public static Item dolch;
    int dolchID = 900;
    
    //Tabs
    public static CreativeTabs tabMetall = new CreativeTabMetall(CreativeTabs.getNextID(),"tabMetall");
    public static CreativeTabs tabWirtschaft = new CreativeTabWirtschaft(CreativeTabs.getNextID(),"tabWirtschaft");
    public static CreativeTabs tabUMetall = new CreativeTabUMetall(CreativeTabs.getNextID(),"tabUMetall");
    public static CreativeTabs tabAllomanti = new CreativeTabAllomanti(CreativeTabs.getNextID(),"tabAllomanti");
    public static CreativeTabs tabEssen = new CreativeTabEssen(CreativeTabs.getNextID(),"tabEssen");
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent PreEvent)
    {
    	//Essen
    	brei= new com.mistborn.items.brei().setUnlocalizedName("brei").setTextureName("mistborn:brei").setCreativeTab(tabEssen);
    	suppe= new com.mistborn.items.suppe().setUnlocalizedName("suppe").setTextureName("mistborn:suppe").setCreativeTab(tabEssen);
    	kase= new com.mistborn.items.kase().setUnlocalizedName("kase").setTextureName("mistborn:kase").setCreativeTab(tabEssen);
    	skase= new com.mistborn.items.skase().setUnlocalizedName("skase").setTextureName("mistborn:skase").setCreativeTab(tabEssen);
    	sskase= new com.mistborn.items.sskase().setUnlocalizedName("sskase").setTextureName("mistborn:sskase").setCreativeTab(tabEssen);
    	traube= new com.mistborn.items.traube().setUnlocalizedName("traube").setTextureName("mistborn:traube").setCreativeTab(tabEssen);
    	rtraube= new com.mistborn.items.rtraube().setUnlocalizedName("rtraube").setTextureName("mistborn:rtraube").setCreativeTab(tabEssen);
    	
    	
    	//Wirtschaft
    	clipser= new clipser(clipserID).setUnlocalizedName("clipser").setTextureName("mistborn:clipser").setCreativeTab(tabWirtschaft);
    	gulde= new com.mistborn.items.gulde(guldeID).setUnlocalizedName("gulde").setTextureName("mistborn:gulde").setCreativeTab(tabWirtschaft);
    	zehnerclipser= new zehnerclipser(zehnerclipserID).setUnlocalizedName("zehnerclipser").setTextureName("mistborn:zehnerclipser").setCreativeTab(tabWirtschaft);
    	kastling= new com.mistborn.items.kastling(kastlingID).setUnlocalizedName("kastling").setTextureName("mistborn:kastling").setCreativeTab(tabWirtschaft);
    	
    	//Kampf
    	glasdolch= new glasdolch(enumToolMaterialTest).setUnlocalizedName("glasdolch").setTextureName("mistborn:glasdolch").setCreativeTab(tabAllomanti);
    	obsidiandolch= new obsidiandolch(enumToolMaterial).setUnlocalizedName("obsidiandolch").setTextureName("mistborn:obsidiandolch").setCreativeTab(tabAllomanti);
    	nebeldolch= new nebeldolch(Nebel).setUnlocalizedName("nebeldolch").setTextureName("mistborn:nebeldolch").setCreativeTab(tabAllomanti);
    	holzstab= new holzstab(Holz).setUnlocalizedName("holzstab").setTextureName("mistborn:holzstab").setCreativeTab(tabAllomanti);
    	nebelschwert= new nebelschwert(Nebel).setUnlocalizedName("nebelschwert").setTextureName("mistborn:nebelschwert").setCreativeTab(tabAllomanti);
    	nebel_nugget= new nebel_nugget(nebel_nuggetID).setUnlocalizedName("nebel_nugget").setTextureName("mistborn:nebel_nugget").setCreativeTab(tabAllomanti);
    	nebel_ingot= new nebel_ingot(nebel_ingotID).setUnlocalizedName("nebel_ingot").setTextureName("mistborn:nebel_ingot").setCreativeTab(tabAllomanti);
    	rohernebel= new rohernebel(rohernebelID).setUnlocalizedName("rohernebel").setTextureName("mistborn:rohernebel").setCreativeTab(tabAllomanti);
    	nebelstoff= new nebelstoff(nebelstoffID).setUnlocalizedName("nebelstoff").setTextureName("mistborn:nebelstoff").setCreativeTab(tabAllomanti);
    	vnebel= new vnebel(vnebelID).setUnlocalizedName("vnebel").setTextureName("mistborn:vnebel").setCreativeTab(tabAllomanti);
    	gnebel= new gnebel(gnebelID).setUnlocalizedName("gnebel").setTextureName("mistborn:gnebel").setCreativeTab(tabAllomanti);
    	obsidianschwert= new obsidianschwert(enumToolMaterial).setUnlocalizedName("obsidianschwert").setTextureName("mistborn:obsidianschwert").setCreativeTab(tabAllomanti);
    	glasschwert= new glasschwert(enumToolMaterialTest).setUnlocalizedName("glasschwert").setTextureName("mistborn:glasschwert").setCreativeTab(tabAllomanti);
    	eisdolch= new eisdolch(Eis).setUnlocalizedName("eisdolch").setTextureName("mistborn:eisdolch").setCreativeTab(tabAllomanti);
    	eisschwert= new eisschwert(Eis).setUnlocalizedName("eisschwert").setTextureName("mistborn:eisschwert").setCreativeTab(tabAllomanti);
    	dolch= new com.mistborn.items.dolch(dolchID).setUnlocalizedName("dolch").setTextureName("mistborn:dolch");
    	
    	
    	//Metalle
    	weisblech= new com.mistborn.items.weisblech(weisblechID).setUnlocalizedName("weisblech").setTextureName("mistborn:weisblech").setCreativeTab(tabMetall);
    	zinn= new zinn(zinnID).setUnlocalizedName("zinn").setTextureName("mistborn:zinn").setCreativeTab(tabMetall);
    	stahl= new stahl(stahlID).setUnlocalizedName("stahl").setTextureName("mistborn:stahl").setCreativeTab(tabMetall);
    	kupfer= new kupfer(kupferID).setUnlocalizedName("kupfer").setTextureName("mistborn:kupfer").setCreativeTab(tabMetall);
    	bronze= new bronze(bronzeID).setUnlocalizedName("bronze").setTextureName("mistborn:bronze").setCreativeTab(tabMetall);
    	messing= new messing(messingID).setUnlocalizedName("messing").setTextureName("mistborn:messing").setCreativeTab(tabMetall);
    	zink= new zink(zinkID).setUnlocalizedName("zink").setTextureName("mistborn:zink").setCreativeTab(tabMetall);
    	bendalloy= new bendalloy(bendalloyID).setUnlocalizedName("bendalloy").setTextureName("mistborn:bendalloy").setCreativeTab(tabMetall);
    	cadmium= new cadmium(cadmiumID).setUnlocalizedName("cadmium").setTextureName("mistborn:cadmium").setCreativeTab(tabMetall);
    	duralomin= new duralomin(duralominID).setUnlocalizedName("duralomin").setTextureName("mistborn:duralomin").setCreativeTab(tabMetall);
    	krypton= new krypton(kryptonID).setUnlocalizedName("krypton").setTextureName("mistborn:krypton").setCreativeTab(tabMetall);
    	ragonium= new ragonium(ragoniumID).setUnlocalizedName("ragonium").setTextureName("mistborn:ragonium").setCreativeTab(tabMetall);
    	atium= new atium(atiumID).setUnlocalizedName("atium").setTextureName("mistborn:atium").setCreativeTab(tabMetall);
    	uweisblech= new com.mistborn.items.uweisblech(uweisblechID).setUnlocalizedName("weisblech").setTextureName("mistborn:weisblech").setCreativeTab(tabUMetall);
    	uzinn= new com.mistborn.items.uzinn(uzinnID).setUnlocalizedName("zinn").setTextureName("mistborn:zinn").setCreativeTab(tabUMetall);
    	ustahl= new com.mistborn.items.ustahl(ustahlID).setUnlocalizedName("stahl").setTextureName("mistborn:stahl").setCreativeTab(tabUMetall);
    	ukupfer= new com.mistborn.items.ukupfer(ukupferID).setUnlocalizedName("kupfer").setTextureName("mistborn:kupfer").setCreativeTab(tabUMetall);
    	ubronze= new com.mistborn.items.ubronze(ubronzeID).setUnlocalizedName("bronze").setTextureName("mistborn:bronze").setCreativeTab(tabUMetall);
    	umessing= new com.mistborn.items.umessing(umessingID).setUnlocalizedName("messing").setTextureName("mistborn:messing").setCreativeTab(tabUMetall);
    	uzink= new com.mistborn.items.uzink(uzinkID).setUnlocalizedName("zink").setTextureName("mistborn:zink").setCreativeTab(tabUMetall);
    	ubendalloy= new com.mistborn.items.ubendalloy(ubendalloyID).setUnlocalizedName("bendalloy").setTextureName("mistborn:bendalloy").setCreativeTab(tabUMetall);
    	ucadmium= new com.mistborn.items.ucadmium(ucadmiumID).setUnlocalizedName("cadmium").setTextureName("mistborn:cadmium").setCreativeTab(tabUMetall);
    	uduralomin= new com.mistborn.items.uduralomin(uduralominID).setUnlocalizedName("duralomin").setTextureName("mistborn:duralomin").setCreativeTab(tabUMetall);
    	ukrypton= new com.mistborn.items.ukrypton(ukryptonID).setUnlocalizedName("krypton").setTextureName("mistborn:krypton").setCreativeTab(tabUMetall);
    	uragonium= new com.mistborn.items.uragonium(uragoniumID).setUnlocalizedName("ragonium").setTextureName("mistborn:ragonium").setCreativeTab(tabUMetall);
    	uatium= new com.mistborn.items.uatium(uatiumID).setUnlocalizedName("atium").setTextureName("mistborn:atium").setCreativeTab(tabUMetall);
    	uuweisblech= new com.mistborn.items.uuweisblech(uuweisblechID).setUnlocalizedName("weisblech").setTextureName("mistborn:weisblech").setCreativeTab(tabUMetall);
    	uuzinn= new com.mistborn.items.uuzinn(uuzinnID).setUnlocalizedName("zinn").setTextureName("mistborn:zinn").setCreativeTab(tabUMetall);
    	uustahl= new com.mistborn.items.uustahl(uustahlID).setUnlocalizedName("stahl").setTextureName("mistborn:stahl").setCreativeTab(tabUMetall);
    	uukupfer= new com.mistborn.items.uukupfer(uukupferID).setUnlocalizedName("kupfer").setTextureName("mistborn:kupfer").setCreativeTab(tabUMetall);
    	uubronze= new com.mistborn.items.uubronze(uubronzeID).setUnlocalizedName("bronze").setTextureName("mistborn:bronze").setCreativeTab(tabUMetall);
    	uumessing= new com.mistborn.items.uumessing(uumessingID).setUnlocalizedName("messing").setTextureName("mistborn:messing").setCreativeTab(tabUMetall);
    	uuzink= new com.mistborn.items.uuzink(uuzinkID).setUnlocalizedName("zink").setTextureName("mistborn:zink").setCreativeTab(tabUMetall);
    	uubendalloy= new com.mistborn.items.uubendalloy(uubendalloyID).setUnlocalizedName("bendalloy").setTextureName("mistborn:bendalloy").setCreativeTab(tabUMetall);
    	uucadmium= new com.mistborn.items.uucadmium(uucadmiumID).setUnlocalizedName("cadmium").setTextureName("mistborn:cadmium").setCreativeTab(tabUMetall);
    	uuduralomin= new com.mistborn.items.uuduralomin(uuduralominID).setUnlocalizedName("duralomin").setTextureName("mistborn:duralomin").setCreativeTab(tabUMetall);
    	uukrypton= new com.mistborn.items.uukrypton(uukryptonID).setUnlocalizedName("krypton").setTextureName("mistborn:krypton").setCreativeTab(tabUMetall);
    	uuragonium= new com.mistborn.items.uuragonium(uuragoniumID).setUnlocalizedName("ragonium").setTextureName("mistborn:ragonium").setCreativeTab(tabUMetall);
    	uuatium= new com.mistborn.items.uuatium(uuatiumID).setUnlocalizedName("atium").setTextureName("mistborn:atium").setCreativeTab(tabUMetall);
    	uuuweisblech= new com.mistborn.items.uuuweisblech(uuuweisblechID).setUnlocalizedName("weisblech").setTextureName("mistborn:weisblech").setCreativeTab(tabUMetall);
    	uuuzinn= new com.mistborn.items.uuuzinn(uuuzinnID).setUnlocalizedName("zinn").setTextureName("mistborn:zinn").setCreativeTab(tabUMetall);
    	uuustahl= new com.mistborn.items.uuustahl(uuustahlID).setUnlocalizedName("stahl").setTextureName("mistborn:stahl").setCreativeTab(tabUMetall);
    	uuukupfer= new com.mistborn.items.uuukupfer(uuukupferID).setUnlocalizedName("kupfer").setTextureName("mistborn:kupfer").setCreativeTab(tabUMetall);
    	uuubronze= new com.mistborn.items.uuubronze(uuubronzeID).setUnlocalizedName("bronze").setTextureName("mistborn:bronze").setCreativeTab(tabUMetall);
    	uuumessing= new com.mistborn.items.uuumessing(uuumessingID).setUnlocalizedName("messing").setTextureName("mistborn:messing").setCreativeTab(tabUMetall);
    	uuuzink= new com.mistborn.items.uuuzink(uuuzinkID).setUnlocalizedName("zink").setTextureName("mistborn:zink").setCreativeTab(tabUMetall);
    	uuubendalloy= new com.mistborn.items.uuubendalloy(uuubendalloyID).setUnlocalizedName("bendalloy").setTextureName("mistborn:bendalloy").setCreativeTab(tabUMetall);
    	uuucadmium= new com.mistborn.items.uuucadmium(uuucadmiumID).setUnlocalizedName("cadmium").setTextureName("mistborn:cadmium").setCreativeTab(tabUMetall);
    	uuuduralomin= new com.mistborn.items.uuuduralomin(uuuduralominID).setUnlocalizedName("duralomin").setTextureName("mistborn:duralomin").setCreativeTab(tabUMetall);
    	uuukrypton= new com.mistborn.items.uuukrypton(uuukryptonID).setUnlocalizedName("krypton").setTextureName("mistborn:krypton").setCreativeTab(tabUMetall);
    	uuuragonium= new com.mistborn.items.uuuragonium(uuuragoniumID).setUnlocalizedName("ragonium").setTextureName("mistborn:ragonium").setCreativeTab(tabUMetall);
    	uuuatium= new com.mistborn.items.uuuatium(uuuatiumID).setUnlocalizedName("atium").setTextureName("mistborn:atium").setCreativeTab(tabUMetall);
    	
    	
    	
    	
    	//Essen
    	GameRegistry.registerItem(brei, "brei");
    	GameRegistry.registerItem(suppe, "suppe");
    	GameRegistry.registerItem(kase, "kase");
    	GameRegistry.registerItem(skase, "skase");
    	GameRegistry.registerItem(sskase, "sskase");
    	GameRegistry.registerItem(traube, "traube");
    	GameRegistry.registerItem(rtraube, "rtraube");
    	
    	
    	//Wirtschaft
    	GameRegistry.registerItem(clipser, "clipser");
    	GameRegistry.registerItem(gulde, "gulde");
    	GameRegistry.registerItem(zehnerclipser, "zehnerclipser");
    	GameRegistry.registerItem(kastling, "kastling");
    	
    	//Kampf
    	GameRegistry.registerItem(glasdolch, "glasdolch");
    	GameRegistry.registerItem(nebeldolch, "nebeldolch");
    	GameRegistry.registerItem(obsidiandolch, "obsidiandolch");
    	GameRegistry.registerItem(nebelschwert, "nebelschwert");
    	GameRegistry.registerItem(holzstab, "holzstab");
    	GameRegistry.registerItem(nebelstoff, "nebelstoff");
    	GameRegistry.registerItem(nebel_nugget, "nebel_nugget");
    	GameRegistry.registerItem(nebel_ingot, "nebel_ingot");
    	GameRegistry.registerItem(vnebel, "vnebel");
    	GameRegistry.registerItem(rohernebel, "rohernebel");
    	GameRegistry.registerItem(gnebel, "gnebel");
    	GameRegistry.registerItem(glasschwert, "glasschwert");
    	GameRegistry.registerItem(obsidianschwert, "obsidianschwert");
    	GameRegistry.registerItem(eisschwert, "eisschwert");
    	GameRegistry.registerItem(eisdolch, "eisdolch");
    	GameRegistry.registerItem(dolch, "dolch");
    	
    	
    	
    	//Metalle
    	GameRegistry.registerItem(weisblech, "weisblech");
    	GameRegistry.registerItem(zinn, "zinn");
    	GameRegistry.registerItem(stahl, "stahl");
    	GameRegistry.registerItem(kupfer, "kupfer");
    	GameRegistry.registerItem(bronze, "bronze");
    	GameRegistry.registerItem(messing, "messing");
    	GameRegistry.registerItem(zink, "zink");
    	GameRegistry.registerItem(bendalloy, "bendalloy");
    	GameRegistry.registerItem(cadmium, "cadmium");
    	GameRegistry.registerItem(duralomin, "duralomin");
    	GameRegistry.registerItem(krypton, "krypton");
    	GameRegistry.registerItem(ragonium, "ragonium");
    	GameRegistry.registerItem(atium, "atium");
    	GameRegistry.registerItem(uweisblech, "uweisblech");
    	GameRegistry.registerItem(uzinn, "uzinn");
    	GameRegistry.registerItem(ustahl, "ustahl");
    	GameRegistry.registerItem(ukupfer, "ukupfer");
    	GameRegistry.registerItem(ubronze, "ubronze");
    	GameRegistry.registerItem(umessing, "umessing");
    	GameRegistry.registerItem(uzink, "uzink");
    	GameRegistry.registerItem(ubendalloy, "ubendalloy");
    	GameRegistry.registerItem(ucadmium, "ucadmium");
    	GameRegistry.registerItem(uduralomin, "uduralomin");
    	GameRegistry.registerItem(ukrypton, "ukrypton");
    	GameRegistry.registerItem(uragonium, "uragonium");
    	GameRegistry.registerItem(uatium, "uatium");
    	GameRegistry.registerItem(uuweisblech, "uuweisblech");
    	GameRegistry.registerItem(uuzinn, "uuzinn");
    	GameRegistry.registerItem(uustahl, "uustahl");
    	GameRegistry.registerItem(uukupfer, "uukupfer");
    	GameRegistry.registerItem(uubronze, "uubronze");
    	GameRegistry.registerItem(uumessing, "uumessing");
    	GameRegistry.registerItem(uuzink, "uuzink");
    	GameRegistry.registerItem(uubendalloy, "uubendalloy");
    	GameRegistry.registerItem(uucadmium, "uucadmium");
    	GameRegistry.registerItem(uuduralomin, "uuduralomin");
    	GameRegistry.registerItem(uukrypton, "uukrypton");
    	GameRegistry.registerItem(uuragonium, "uuragonium");
    	GameRegistry.registerItem(uuatium, "uuatium");
    	GameRegistry.registerItem(uuuweisblech, "uuuweisblech");
    	GameRegistry.registerItem(uuuzinn, "uuuzinn");
    	GameRegistry.registerItem(uuustahl, "uuustahl");
    	GameRegistry.registerItem(uuukupfer, "uuukupfer");
    	GameRegistry.registerItem(uuubronze, "uuubronze");
    	GameRegistry.registerItem(uuumessing, "uuumessing");
    	GameRegistry.registerItem(uuuzink, "uuuzink");
    	GameRegistry.registerItem(uuubendalloy, "uuubendalloy");
    	GameRegistry.registerItem(uuucadmium, "uuucadmium");
    	GameRegistry.registerItem(uuuduralomin, "uuuduralomin");
    	GameRegistry.registerItem(uuukrypton, "uuukrypton");
    	GameRegistry.registerItem(uuuragonium, "uuuragonium");
    	GameRegistry.registerItem(uuuatium, "uuuatium");
    	
    	EntityMain.registeryMain();
    	CraftingManager.Mistborn();
    	//EntityMain.createEntity(EntityOberHerr.class, new RenderOberHerr(null, atiumID), "Oberster Herrscher", EnumCreatureType.monster, 0, 0, 0, new BiomeGenBase[]{}, 2552550, 25500, true);
		
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	
    	
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
	proxy.registerRenderThings();
    	
    }
}
