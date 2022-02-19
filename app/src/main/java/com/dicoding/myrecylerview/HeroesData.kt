package com.dicoding.myrecylerview

import android.provider.Settings.Global.getString
import android.text.Layout
import com.bumptech.glide.load.engine.Resource

object HeroesData {

    
    val heroNames = arrayOf(
        "Albedo",
        "Amber",
        "Bennet",
        "Diluc",
        "Eula",
        "Jean",
        "Kaeya",
        "Noelle",
        "Razor",
        "Sucrose")

    val heroDetails = arrayOf(
        "also known as the \"Kreideprinz\" is a playable Geo character in Genshin Impact.",
        "The only remaining Outrider of the Knights of Favonius.",
        "An orphan discovered by an elderly adventurer as a baby, Bennett was raised in Mondstadt's Adventurers' Guild.",
        "Born into the affluent Ragnvindr Clan, Diluc is the current owner of the Dawn Winery and a nobleman of high esteem in Mondstadt society.",
        "A descendant of the infamous and tyrannical Lawrence Clan and the captain of the Reconnaissance Company with the Knights of Favonius.",
        "A descendant of the prestigious Gunnhildr Clan and The Acting Grand Master of the Knights of Favonius.",
        "A Cavalry Captain in the Knights of Favonius. He is held in high regard by the people of Mondstadt—even with all his eccentricities and secrets.",
        "While not yet a knight, she seeks to one day join the Knights of Favonius by first serving as a dutiful maid.",
        "Abandoned as an infant, Razor was taken in by the Wolf of the North, Andrius, and raised by his wolf pack in Wolvendom.",
        "An alchemist specializing in bio-alchemy, she also serves as an assistant for Albedo, the head alchemist of the Knights of Favonius."
    )

    val heroesImages = intArrayOf(
        R.drawable.albedo,
        R.drawable.amber,
        R.drawable.bennet,
        R.drawable.diluc,
        R.drawable.eula,
        R.drawable.jean,
        R.drawable.kaeya,
        R.drawable.noelle,
        R.drawable.razor,
        R.drawable.sucrose)

    val heroesBackground = intArrayOf(
        R.drawable.balbedo,
        R.drawable.bamber,
        R.drawable.bbennet,
        R.drawable.bdiluc,
        R.drawable.beula,
        R.drawable.bjean,
        R.drawable.bkaeya,
        R.drawable.bnoelle,
        R.drawable.brazor,
        R.drawable.bsucrose,
    )

    val name = arrayOf(
        R.string.dummy_value,
        R.string.amber,
        R.string.bennet,
        R.string.diluc,
        R.string.eula,
        R.string.jean,
        R.string.kaeya,
        R.string.noelle,
        R.string.razor,
        R.string.sucrose,


    )

    val heroesdesc = arrayOf(
        R.string.content_text,
        R.string.desc_amber,
        R.string.bennet_desc,
        R.string.diluc_desc,
        R.string.eula_desc,
        R.string.jean_desc,
        R.string.kaeya_desc,
        R.string.noelle_desc,
        R.string.razor_desc,
        R.string.sucrose_desc,
    )

    val heropang = arrayOf(
        R.string.stock,
        R.string.pang_amber,
        R.string.pang_bennet,
        R.string.pang_diluc,
        R.string.pang_eula,
        R.string.pang_jean,
        R.string.pang_Kaeya,
        R.string.pang_noelle,
        R.string.pang_razor,
        R.string.pang_sucrose
    )

    val vcheroname = arrayOf(
        R.string.my_name,
        R.string.amber_vc,
        R.string.bennet_vc,
        R.string.diluc_vc,
        R.string.eula_vc,
        R.string.jean_vc,
        R.string.kaeya_vc,
        R.string.noelle_vc,
        R.string.razor_vc,
        R.string.sucrose_vc
    )

    val vchero = arrayOf(
        R.drawable.kenji_nojima,
        R.drawable.iwami_manaka,
        R.drawable.ousaka_ryouto,
        R.drawable.ono_kensho,
        R.drawable.rina_sato,
        R.drawable.chiwa_saito,
        R.drawable.toriumi_kosuke,
        R.drawable.takao_kanon,
        R.drawable.uchiyama_kouki,
        R.drawable.fujita_akane
    )

    val basic = arrayOf(
        R.string.albedo_basic,
        R.string.Amber_basic,
        R.string.bennetbasic,
        R.string.diluc_basic,
        R.string.eula_basic,
        R.string.jean_basic,
        R.string.kaeya_basic,
        R.string.noelle_basic,
        R.string.razor_basic,
        R.string.sucrose_basic
    )

    val basicicon = arrayOf(
        R.drawable.talent_favonius_bladework_weiss,
        R.drawable.talent_sharpshooter,
        R.drawable.talent_strike_of_fortune,
        R.drawable.talent_tempered_sword,
        R.drawable.talent_favonius_bladework_edel,
        R.drawable.talent_favonius_bladework,
        R.drawable.talent_ceremonial_bladework,
        R.drawable.talent_favonius_bladework_maid,
        R.drawable.talent_steel_fang,
        R.drawable.talent_wind_spirit_creation
    )

    val basicdesc = arrayOf(
        R.string.Albedo_basic_desc,
        R.string.Amber_basic_desc,
        R.string.bennetbasicdesc,
        R.string.diluc_basic_desc,
        R.string.eula_basic_desc,
        R.string.jean_basic_desc,
        R.string.kaeya_basic_desc,
        R.string.noelle_basic_desc,
        R.string.razor_basic_desc,
        R.string.sucrose_basic_desc
    )

    val iconE = arrayOf(
        R.drawable.talent_abiogenesis_solar_isotoma,
        R.drawable.talent_explosive_puppet,
        R.drawable.talent_passion_overload,
        R.drawable.talent_searing_onslaught,
        R.drawable.talent_icetide_vortex,
        R.drawable.talent_gale_blade,
        R.drawable.talent_frostgnaw,
        R.drawable.talent_breastplate,
        R.drawable.talent_claw_and_thunder,
        R.drawable.talent_astable_anemohypostasis_creation
    )


    val nameE = arrayOf(
        R.string.Albedo_E,
        R.string.Amber_E,
        R.string.bennetE,
        R.string.diluc_E,
        R.string.eula_E,
        R.string.jean_E,
        R.string.kaeya_E,
        R.string.noelle_E,
        R.string.razor_E,
        R.string.sucrose_E
    )

    val descE = arrayOf(
        R.string.Albedo_E_desc,
        R.string.Amber_E_desc,
        R.string.bennetRdesc,
        R.string.diluc_E_desc,
        R.string.eula_E_desc,
        R.string.jean_E_desc,
        R.string.kaeya_E_desc,
        R.string.noelle_E_desc,
        R.string.razor_E_desc,
        R.string.sucrose_E_desc
    )

    val iconBurst = arrayOf(
        R.drawable.talent_rite_of_progeniture_tectonic_tide,
        R.drawable.talent_fiery_rain,
        R.drawable.talent_fantastic_voyage,
        R.drawable.talent_dawn,
        R.drawable.talent_glacial_illumination,
        R.drawable.talent_dandelion_breeze,
        R.drawable.talent_glacial_waltz,
        R.drawable.talent_sweeping_time,
        R.drawable.talent_lightning_fang,
        R.drawable.talent_forbidden_creation
    )

    val burstname = arrayOf(
        R.string.Amber_burst,
        R.string.Amber_burst,
        R.string.bennetBurst,
        R.string.diluc_burst,
        R.string.eula_burst,
        R.string.jean_burst,
        R.string.kaeya_burst,
        R.string.noelle_burst,
        R.string.razor_burst,
        R.string.sucrose_burst
    )

    val burstdesc = arrayOf(
        R.string.Albedo_burst_desc,
        R.string.Amber_burst_desc,
        R.string.bennetBurstdesc,
        R.string.diluc_burst_desc,
        R.string.eula_burst_desc,
        R.string.jean_burst_desc,
        R.string.kaeya_burst_desc,
        R.string.noelle_burst_desc,
        R.string.razor_burst_desc,
        R.string.sucrose_burst_desc
    )

    val birthhero = arrayOf(
        R.string.content_specs_display,
        R.string.amber_birthday,
        R.string.bennet_birthday,
        R.string.diluc_birthday,
        R.string.eula_birthday,
        R.string.jean_birthday,
        R.string.kaeya_birthday,
        R.string.noelle_birthday,
        R.string.razor_birthday,
        R.string.sucrose_birthday
    )

}