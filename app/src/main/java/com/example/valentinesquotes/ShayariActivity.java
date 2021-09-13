package com.example.valentinesquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ShayariActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ShayariData> list;

    private int cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayari);

        list = new ArrayList<>();

        cat = getIntent().getIntExtra("cat", 1);

        switch (cat) {
            case 1:
                initList();
                break;
            case 2:
                initList2();
                break;
            case 3:
                initList3();
                break;
            case 4:
                initList4();
                break;
            case 5:
                initList5();
                break;
            case 6:
                initList6();
                break;
            case 7:
                initList7();
                break;
            case 8:
                initList8();
                break;
        }

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ShayariAdapter(this, list));

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void initList() {
        list.add(new ShayariData("তোমার জীবন হোক গোলাপের মত সুন্দর আর পবিত্র । \nহ্যাপি রোজ ডে"));
        list.add(new ShayariData("গোলাপ দেখতে অনেক সুন্দর কিন্তু এতে আছে কাঁটা, তেমনি ভালোবাসা অনেক সুন্দর কিন্তু এর ভিতরে আছে যন্ত্রণা । \nHappy Rose Day"));
        list.add(new ShayariData("জীবন সুন্দর হয় মানুষকে ভালবাসলে, মানুষকে সাহায্য করলে, পবিত্র ভালোবাসায় সুন্দর হোক সবার জীবন । \nHappy Rose Day"));
        list.add(new ShayariData("আমার সব ভালোবাসা তোমার জন্য, তাই তুমি আছো আমার হৃদয়ের ফুলদানীতে গোলাপ হয়ে । তোমাকে পেয়ে ধন্য আমার আজকের গোলাপ দিবস । \nহ্যাপি রোজ ডে ।"));
        list.add(new ShayariData("ফুলে ফুলে সাজিয়ে রেখো তোমার জীবন । সুন্দর স্বপ্নে ভরে থাকুক তোমার জীবন । গোলাপ দিবসে ভরে যাক তোমার মন মিষ্টি ফুলের সুগন্ধে । \nHappy Rose Day"));
        list.add(new ShayariData("আল্লাহ্\u200Cকে ভালোবাসো পাবে ভরসা\n" +
                "সপ্নকে ভালোবাসো পাবে আশা\n" +
                "মানুষকে ভালোবাসো পাবে ভালোবাসা\n" +
                "গোলাপকে ভালোবাসো পাবে মনের পবিত্রতা\n" +
                "শুভ গোলাপ দিবস"));
        list.add(new ShayariData("ভালোবাসার আহবানে তোমাকে চাই আরো কাছে\n" +
                "সপ্নটা সত্যি হবে তোমাকে কাছে পেলে\n" +
                "জীবন হবে ধন্য তুমি আমার হলে\n" +
                "গোলাপ দিবস ধন্য হবে আমার গোলাপ নিলে\n" +
                "শুভ গোলাপ দিবস"));
        list.add(new ShayariData("আমি ঈশ্বরের কাছে গোলাপ চেয়েছিলাম\n" +
                "আর আল্লাহ আমাকে গোলাপের বাগান দিয়েছেন\n" +
                "আমি তাকে এক ফোঁটা জল জিজ্ঞাসা করলাম\n" +
                "এবং ঈশ্বর আমাকে একটি মহাসাগর দিয়েছেন,\n" +
                "আমি তাকে দেবদূতের জন্য জিজ্ঞাসা করেছি\n" +
                "এবং ঈশ্বর আমাকে আপনি আমার ভালবাসা দিয়েছেন!\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("বিশ্বের অনেক সুন্দর ফুল তবে আমার ফুল তুমি।\n" +
                "তুমি অন্যের তুলনায় সবচেয়ে সুন্দর,\n" +
                "আমি তোমার সুন্দর গোলাপ।\n" +
                "Happy Rose Day প্রিয় !!"));
        list.add(new ShayariData("\n" +
                "সবাই সবচেয়ে সুন্দর মেয়েকে ভালবাসে,\n" +
                "তবে আমি তোমাকে ভালবাসি আমার লাল গোলাপ,\n" +
                "তুমি কেবল আমার জীবনকে সুন্দর করে তোলেন ..\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("গোলাপগুলি ভালোবাসার সুন্দর ভাষা,\n" +
                "আমরা কী বলতে পারি না গোলাপগুলি বলা হয়।\n" +
                "এই গোলাপটি তোমার জন্য আমার গভীর ভালবাসার সাথে ..\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("তুমি আমার স্বপ্নের গোলাপ ..\n" +
                "তুমি আমার হাসির গোলাপ…\n" +
                "তুমি আমার হৃদয়ের গোলাপ…।\n" +
                "তুমি আমার জীবনের রোজ ……।\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("আমি চাই তুমি আমার সাথে থাকো….\n" +
                "যতক্ষণ না আকাশে তারা রয়েছে,\n" +
                "সমুদ্রের জল আছে পর্যন্ত।\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("তোমার সুন্দর হাসি এবং তোমার সুখী হাসি " +
                "আমাকে তোমার প্রতি আকৃষ্ট করেছিল, তবে তোমার যত্নশীল প্রেমময় হৃদয় হল " +
                "আমি কেন আমার বাকী জীবনটি তোমার সাথে কাটাতে চাই। \nHappy Rose Day"));
        list.add(new ShayariData("আমার প্রিয়তমের জীবন হাসি দেওয়ার লক্ষ লক্ষ কারণ ভরে উঠুক? প্রতিদিন যেন আমি রোজের সাথে আমার সমস্ত ভালবাসা তোমাকে প্রেরণে প্রত্যাশার এক দিন হতে পারি।\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("তুমি আমার অনুভূতি গোলাপের মতো ফুলে উঠেছে।\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("আমার জীবনে থাকার জন্য তোমার জন্য একটি গোলাপ\n" +
                "আমার জীবনটি সম্পূর্ণ করার জন্য তোমাকে ধন্যবাদ।\n" +
                "Happy Rose Day .. !!"));
        list.add(new ShayariData("আমার জীবনের জন্য গুচ্ছ গোলাপ\n" +
                "আমি তোমাকে ছাড়া বাঁচতে পারি না। \n" +
                "Happy Rose Day.."));
        list.add(new ShayariData("গোলাপ নিঃশব্দে ভালবাসার কথা বলে,\n" +
                "একটি ভাষায় জানুন কেবলমাত্র হৃদয়কে।\n" +
                "Happy Rose Day .. !!"));
        list.add(new ShayariData("তোমার সম্পর্কে সমস্ত কিছু আকর্ষণীয়, তোমার হাসি, তোমার সৌন্দর্য, তোমার সুগন্ধ এবং তোমার সংস্থা, আমি সর্বদা আমার মুখে হাসি দিয়ে তোমার কথা ভাবি ..\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("আমি তোমাকে প্রতিবার ভালবাসি ..\n" +
                "আমি তোমাকে প্রতি সেকেন্ডে ভালবাসি ..\n" +
                "আমি তোমাকে প্রতি মুহূর্তে ভালবাসি ..\n" +
                "আমি তোমাকে প্রতিদিন ভালোবাসি..\n" +
                "তাই তোমাকে শুভেচ্ছা জানাতে আমার কোনও অনুষ্ঠানের দরকার নেই …\n" +
                "তোমার সাথে আমার প্রতিদিন যেমন আছে\n" +
                "Happy গোলাপ দিবস"));
        list.add(new ShayariData("ফুলের মতো ফুলগুলিতে হাসুন, তোমার জীবনে কোনও অসহায়ত্ব নেই,\n" +
                "আমরা তোমার জন্য একটি সুন্দর ছোট গোলাপ এনেছি,\n" +
                "ঠিক এখন এই গোলাপের মতো জীবনটি তোমার জীবন হওয়া উচিত। \n" +
                "Happy Rose Day"));
        list.add(new ShayariData("24 ঘন্টা একটি সুন্দর দিন তৈরি করে,\n" +
                "7 দিন একটি সুন্দর সপ্তাহ তৈরি করুন,\n" +
                "52 সপ্তাহ একটি সুন্দর বছর এবং জেনে একটি\n" +
                "আমার মতো ব্যক্তি তোমার জীবনকে সুন্দর করে তুলবে।\n" +
                "একটি সুন্দর রোজ ডে এন জীবন দিন!\n" +
                "Happy Rose Day\n"));
        list.add(new ShayariData("If you enjoy the fragrance of a rose, you must accept the thorns which it bears. \n" +
                "Happy Rose Day.!"));
        list.add(new ShayariData("Be soft as flower Be strong as rock Be nice as me I know its difficult But just keep trying Be fresh as Rose." +
                "\nHappy Rose Day"));
        list.add(new ShayariData("A rose must remain with the sun and the rain or its lovely promise won’t come true. \n" +
                "Happy Rose Day.!"));
        list.add(new ShayariData("In the Flower, My Rose is you, In the Diamond, My Kohinoor is you, In the Sky, My Moon is you, I m only Body, My Heart is you. That's why i always Miss You. \n" +
                "Happy Rose Day!"));
        list.add(new ShayariData("Can anyone remember love? It’s like trying to summon up the smell of roses in a cellar. You might see a rose, but never the perfume. \n" +
                "Happy Rose Day.!"));
        list.add(new ShayariData("We have chased away the clouds, the sky is all rose. \n" +
                "Happy Rose Day.!"));
        list.add(new ShayariData("R is for Red, Red is for Blood, Blood is for Heart, Heart is for Love, Love is for You, You’re for Me Forever.\n" +
                "Happy Rose Day"));
        list.add(new ShayariData("Not every bird can dance but peacock do it, Not every friend can patch my heart but you do it, Not every flower can express love but Roses do it. \n" +
                "Happy Rose Day!"));
        list.add(new ShayariData("Hope you found this a special rose! with love and care for the one you chose. \n" +
                "Happy Rose day!"));
        list.add(new ShayariData("The Rose is without an explanation; She blooms, because She blooms. \n" +
                "Happy Rose Day.!"));
        list.add(new ShayariData("My eyes are blind without your eyes to see, similar to a rose without color. Love you forever. Happy Rose Day.!"));
        list.add(new ShayariData("The fragrance always stays in the hand that gives the rose. \n" +
                "Happy Rose Day.!\n"));
        list.add(new ShayariData("Actual meaning of giving rose to someone:- R= Rare O=One S=Supporting E=Entire Life. \n" +
                "Happy Rose Day! \""));
        list.add(new ShayariData("This rose day I wish that all the thorns on the path of your life be vanquished and your life path be filled with petals of love, friendship and blessings. \n" +
                "Happy Rose Day!"));
        list.add(new ShayariData("I looked at a sweet, beautiful rose, and then I looked at you and I kept looking at you, for the rose isn't as beautiful as you.\n" +
                "Happy Rose Day!"));
        list.add(new ShayariData("আমি একগুচ্ছ গোলাপের মধ্যে একটি প্লাস্টিকের গোলাপ গুঁজে তোমাকে উপহার দিতে চাই। বলতে চাই, শেষ গোলাপ শুকিয়ে যাওয়া পর্যন্ত আমাদের বন্ধুত্ব স্থায়ী হোক। "));
        list.add(new ShayariData("আমার জীবনের শ্রেষ্ঠ মানুষের প্রতি ভালোবাসা ব্যক্ত করতে শ্রেষ্ঠ গোলাপটি উপহারে দিলাম। \n" +
                "হ্যাপি রোজ ডে প্রিয়তমা।"));
        list.add(new ShayariData("ঠিক যে ভাবে একটি ফুলের যত্ন করা হয়, তেমনই যত্ন পেয়েছি আমি তোমার কাছ থেকে। নিজেকে ফুল ভাবতে শুরু করেছি। প্রিয়তমা, তোমার ভালোবাসার ছায়ায় আমি দিন প্রতিদিন প্রস্ফুটিত হচ্ছি। \n" +
                "হ্যাপি রোজ ডে।"));
    }

    private void initList2() {
        list.add(new ShayariData("বহুদুর পথ ভীষণ আকাবাকা পথ চলতে ভীষণ ভয়,\n" +
                "তুমি এসে বলে দাও, আছি আমি পাশে করো না কিছুতেই ভয়,\n" +
                "হ্যাপি প্রোপজ ডে"));
        list.add(new ShayariData("ভালোবাসা মানে একটা রাত না হয় না ঘুমিয়েই কাটালাম তাতে কি ?\n" +
                "প্রত্যেক প্রহরে আমি তোমার কথা ভেবেই জাগি ।\n" +
                "(( হ্যাপি প্রোপজ ডে ))"));
        list.add(new ShayariData("তুমি আমার শুরু তুমি আমার শেষ\n" +
                "তুমি আমার ভালোবাসার সুখের যত রেশ ।\n" +
                "*** Happy Propose Day ***"));
        list.add(new ShayariData("একজন প্রকৃত প্রেমিক শত শত মেয়েকে ভালোবাসে না,\n" +
                "বরং সে একটি মেয়েকেই শত উপায়ে ভালোবেসে থাকে ।\n" +
                "Happy propose day "));
        list.add(new ShayariData("তোমাকে ভেবে পৃথিবী আমার অদেখা তবু এঁকে যাই,\n" +
                "আমার ভেতর শুধু তুমি আর তো কিছু পায়নি ঠাই ।\n" +
                "*** Happy Propose Day ***"));
        list.add(new ShayariData("aamar jibone keu nei tumi chhara, aamar jibone kono sopno nei tumi chhara, aamar duchokh kichhu khojena tomai chhara, \n" +
                "aami kichhu bhabte parina tomai chhara, aami kichhu likhte parina tomar nam chhara, aami kichhu bujhte chaina tomai chhara! Happy Propose Day"));
        list.add(new ShayariData("mishti chander mishti aalo, basi tomay anek bhalo miti miti tarar mela, dekhbo tomay sarabela nishirate shanto bhubon, chaibo tomay sarajibon. Happy Propose Day"));
        list.add(new ShayariData("bhul tomar chhilo tumi bujhte paroni, rag aamarao chhilo kintu aami dekhai ni. bhule jete aamio partam, kintu cheshta korini, karon bhule jaoar jonya bhalobasini.\n" +
                "Happy Propose Day"));
        list.add(new ShayariData("dushtumi noy ''Really'' fajlami noy ''Seriusly'' dhoka noy ''Sotti'' History noy ''Bastobota'' anyone kauke noy ''2mak'' bolchhi-''I LOVE U'' \n" +
                "Happy Propose Day"));
        list.add(new ShayariData("Joto bhalobasa peichhi, tomar kachh theke. dushtu ei mon chai, aaro beshi pete. ki jani, tomar modhye ki aachhe. keno je a mon chai, tomake aaro beshi kore kachhe pete\n" +
                "Happy Propose Day"));
        list.add(new ShayariData("ভালবাসা তুমি খুঁজে কিছু না\n" +
                "ভালবাসা এমন কিছু যা তোমাকে খুঁজে পায়।\n" +
                "আমি তোমার সাথে থাকতে চাই\n" +
                "আকাশ থেকে সূর্য পড়ার আগ পর্যন্ত\n" +
                "Happy propose day!"));
        list.add(new ShayariData("তুমি আমার জীবনের স্বপ্ন\n" +
                "যার কাছে আমি সত্য হতে চাই\n" +
                "আমি তোমাকে সর্বদা ভালবাসব\n" +
                "এবং পাশাপাশি যত্ন নিতে,\n" +
                "আমার হৃদয় শুধুমাত্র তোমার জন্য প্রহার করে।\n" +
                "Happy propose day"));
        list.add(new ShayariData("তোমার সাথে দেখা হওয়ার আগে আমি কখনই জানতে পারি না ভালোবাসা কী,\n" +
                "তবে তুমি আমার জীবনে ভালবাসার ডানা নিয়ে এসেছ\n" +
                "আমার জন্য আকাশে উড়ে যাওয়ার জন্য।\n" +
                "তোমার ভালবাসা আমাকে এত গর্বিত এবং সুখী করে তোলে।\n" +
                "আমি সবসময় তোমার ভালবাসার সাথে আমার পুরো জীবন কাটাতে চাই।\n" +
                "Happy propose day"));
        list.add(new ShayariData("তোমাকে ছাড়া আমার জীবন অসম্পূর্ণ।\n" +
                "আমি তোমাকে জানতে চাই যে তুমি আমার সমস্ত জিনিস,\n" +
                "এবং আমি তোমাকে চিরকাল আমার হৃদয়ে লুকিয়ে রাখতে চাই।\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমাদের প্রেমের গল্পটি আমাদের মধ্যে বন্ধনের মতোই দুর্দান্ত।\n" +
                "আমরা হাসি, হাসি, যত্ন এবং একসাথে লড়াই করি\n" +
                "তবে আমাদের ভালবাসা চিরকাল একই থাকবে।\n" +
                "আমি তোমায় ভালোবাসি.\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমার চারপাশে অনেক লোক থাকতে পারে,\n" +
                "আমার অনেক বন্ধু আছে তবে আনন্দ এবং ভালবাসার অনুভূতি রয়েছে\n" +
                "আমি তোমার কাছ থেকে পেয়েছি আমি ব্যাখ্যা করতে পারি না।\n" +
                "আমি অনুভব করি যে আমরা দুজনেই একে অপরকে জীবন সম্পূর্ণ করে তুলেছি।\n" +
                "আমি তোমাকে অনেক ভালবাসি.\n" +
                "Happy propose day"));
        list.add(new ShayariData("কখনই জানি না তোমার ভালবাসা কখন আমার হৃদয়ে জায়গা করে নিয়েছে,\n" +
                "আমি তোমাকে অনেক বড় স্বপ্ন দিতে চাই না\n" +
                "তবে তোমার সমস্ত স্বপ্ন পূরণের জন্য তোমাকে আমার বিশ্ব হিসাবে গড়ে তুলতে চাই।\n" +
                "আমি তোমাকে ভালবাসি প্রিয়।\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমাদের জীবনে ভাল বা খারাপ সময় আসবে,\n" +
                "আমি তোমার সাথে সারা জীবন থাকব এবং তোমার হাতটি ধরে রাখব।\n" +
                "আমি তোমার বিশ্বের প্রেমময় হিসাবে চেষ্টা করার চেষ্টা করব\n" +
                "তুমি আমার বিশ্বের হিসাবে সুখী।\n" +
                "Happy propose day!"));
        list.add(new ShayariData("আমি তোমাকে ছাড়া এটি জীবন কল্পনা করতে পারি না,\n" +
                "আমি তোমার সাথে আমার জীবন কাটাতে চাই,\n" +
                "আসুন আমরা আমাদের বাকী জীবন একসাথে কাটিয়ে আসি।\n" +
                "Happy propose day"));
        list.add(new ShayariData("তোমার চোখ নীল সমুদ্রের মতো,\n" +
                "তোমার ঠোঁট প্রকৃতির মিষ্টি অংশের মতো।\n" +
                "আমি সবসময় তোমার সাথে থাকতে চাই  \n" +
                "Happy propose day"));
        list.add(new ShayariData("কোনও কবিতা নেই\n" +
                "অভিনব শব্দ নেই\n" +
                "শুধু আমার সত্য অনুভূতি\n" +
                "তোমার জন্য, আমার ভালোবাসা\n" +
                "Happy propose day"));
        list.add(new ShayariData("ভালোবাসা মেঘের মতো। ভালোবাসা স্বপ্নের মতো।\n" +
                "ভালবাসা একটি শব্দ এবং এর মধ্যে সমস্ত কিছু।\n" +
                "ভালবাসা একটি রূপকথার সত্য হয়।\n" +
                "কারণ আমি যখন তোমাকে পেয়েছি তখন ভালবাসা পেয়েছি।\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমি তোমার সম্পর্কে সবসময় চিন্তা করি\n" +
                "তুমি কি চিরকাল আমার জন্য থাকবেন?\n" +
                "আমি অবশ্যই বলি আমি তোমাকে পছন্দ করি\n" +
                "আমি তোমাকে ছাড়া আমার জীবন বাঁচতে পারি না।\n" +
                "Happy propose day"));
        list.add(new ShayariData("কখনও কখনও, চিরকালের জন্য প্রিয়জনদের\n" +
                "উপর তোমার সমস্ত ভালবাসা ছড়িয়ে দিতে যথেষ্ট।\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমি তোমাকে ছাড়া জীবন কল্পনা করতে পারি না।\n" +
                "তুমি কি সারা জীবন আমার হাতটা শক্ত করে চেপে ধরবে?\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমি তোমাকে অনেক ভালবাসি এবং\n" +
                "চিরকাল তোমাকে চাই তুমি কি আমার হবে.\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমার ভালবাসা,\n" +
                "তুমি আমার জীবনের প্রতিটি সেকেন্ডকে সুন্দর করেছ।\n" +
                "তুমি কি চিরকাল আমার হাত ধরে রাখবে?\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমার সম্পর্কে দ্বিতীয়বার নেই।\n" +
                "আমি তোমাকে অনেক ভালোবাসি. তুমি কি আমার হবে?\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমি কখনও তোমার হাতের উষ্ণতা ভুলতে পারি না।\n" +
                "আমি এটি প্রতিদিন এবং প্রতি রাতে অনুভব করতে চাই। সুতরাং দয়া করে, আমার হন।\n" +
                "Happy propose day"));
        list.add(new ShayariData("আমি তোমার সাথে চলতে চাই,\n" +
                "আমি তোমার সাথে কথা বলতে চাই।\n" +
                "সব সময়ের জন্য আমার পরম ইচ্ছা তোমার সাথে থাকুক!\n" +
                "Happy propose day"));
        list.add(new ShayariData("আজ আমি শেয়ার করতে চাই যে তুমি আমার কাছে বিশ্ব\n" +
                "যার উপস্থিতি এটিকে এত সুন্দর করে তোলে এবং আমার জীবনকে সম্পূর্ণ করে তোলে।\n" +
                "আমি তোমাকে অনেক সুখ দিতে চাই\n" +
                "পাশাপাশি ভালবাসা এবং তুমি চিরকাল আমার জীবনে থাকতে চান।\n" +
                "Happy propose day!"));
        list.add(new ShayariData("আমার অন্য কোনও ভাষার দরকার নেই\n" +
                "কারণ আমার চোখ যা বলেছে তা আমার হৃদয় বলে।\n" +
                "আমি আমার জীবনে সব চাই\n" +
                "আমরা সারা জীবন একসাথে থাকি\n" +
                "আই লাভ ইউ ডিয়ার\n" +
                "Happy propose day!"));
        list.add(new ShayariData("তোমার ভালবাসা সবসময় আমার মনে\n" +
                "এবং আমাকে তোমার সম্পর্কে ভাবিয়ে তুলতে\n" +
                "তুমি আমার স্বপ্নের ব্যক্তি\n" +
                "এবং তুমি আমাকে জীবনের কারণ দিন।\n" +
                "আমি তোমায় ভালোবাসি.\n" +
                "Happy propose day!"));
        list.add(new ShayariData("তুমিই সেই ব্যক্তি যিনি আমাকে বোঝেন\n" +
                "এবং আমি যেমন আছি তেমন ভালবাসুন।\n" +
                "আমি কেবল তোমার হাত ধরে রাখা চাই\n" +
                "আঁটসাঁট এবং কখনও তোমাকে কোথাও যেতে দেয় না,\n" +
                "কারণ তোমার ভালবাসা আমাকে সম্পূর্ণ এবং সুখী করে তোলে।\n" +
                "Happy propose day!"));
    }

    private void initList3() {
        list.add(new ShayariData("আজ বিশ্ব চকলেট ডে\n" +
                "তোমার কি মনে আছে ?\n" +
                "মনে যদি নাই থাকে –\n" +
                "এসএমএস দিয়ে জানিয়ে দিলাম তোমাকে ।\n" +
                " হ্যাপি চকলেট ডে "));
        list.add(new ShayariData("আজকের এই দিনে\n" +
                "বন্ধু তোমায় পড়ে মনে\n" +
                "চকলেট খেতাম দুজনে\n" +
                "ভাবছি এখন মনে মনে ।\n" +
                "((হ্যাপি চকলেট ডে))\n"));
        list.add(new ShayariData("তোমার আমার ভালোবাসায় থাকবে শুভ দৃষ্টি\n" +
                "তোমার আমার সম্পর্ক চকলেটের চেয়েও মিষ্টি ।\n" +
                "*** শুভ চকলেট দিবস ***"));
        list.add(new ShayariData("তোমায় আমি এই দিনে কি দেবো উপহার \n" +
                "চকলেট চাড়া আর কিছুই নেই যে আমার ।\n" +
                "সাথে আছে ভালোবাসা দিবে তোমায় সুখ\n" +
                "ভালোবাসার মিষ্টি মুখে ভরে নিও বুক ।\n" +
                " হ্যাপি চকলেট ডে "));
        list.add(new ShayariData("ভালোবাসা চিউইং গামের মতো,\n" +
                "এটির শুরুতে কেবল স্বাদ!\n" +
                "তবে বন্ধুত্ব চকোলেট এর মতো,\n" +
                "শেষ না হওয়া পর্যন্ত এর স্বাদ!\n" +
                "শুভ চকোলেট দিবস!"));
        list.add(new ShayariData("চকোলেট একটি চকোলেট বাক্স থেকে শেষ হতে পারে\n" +
                "একদিন, সপ্তাহ, মাস বা বছরে,\n" +
                "তবে সত্যিকারের ভালবাসা কখনই হৃদয় থেকে শেষ হয় না,\n" +
                "একটি মিষ্টি ভালোবাসা জন্য। \n" +
                "শুভ চকোলেট দিবস"));
        list.add(new ShayariData("“জীবন চকোলেটগুলির বাক্সের মতো এবং আমি এই বিশেষ বাক্সটি আমার বিশেষ ভালবাসার সাথে ভাগ করতে চাই তোমাকে একটি খুব শুভ চকোলেট দিবস কামনা করি।”"));
        list.add(new ShayariData("যে কেউ একজনের নজর কেড়ে নিতে পারে তবে তোমার হৃদয় ও আত্মাকে ক্যাপচার করতে এটি বিশেষ কাউকে লাগে এবং আমার জন্য বিশেষ কেউ তুমি।\n" +
                "শুভ চকোলেট দিবস!"));
        list.add(new ShayariData("“আমি আশা করি যে তোমার জীবনের প্রতিটি দিনই একটি নতুন চকোলেট দিয়ে আশীর্বাদপ্রাপ্ত একটি শুভ চকোলেট দিবস আমার ভালবাসা।”"));
        list.add(new ShayariData("তুমি আমার মিষ্টি ভ্যালেন্টাইন,\n" +
                "তুমি চকোলেটের মতো মিষ্টি,\n" +
                "তারার মতো উজ্জ্বল,\n" +
                "তুমি আমার কাছে মনোরম ও প্রিয়।\n" +
                " শুভ চকোলেট দিন "));
        list.add(new ShayariData("আমার প্রিয় ভালোবাসা, তোমার প্রতি আমার ভালবাসা এবং যত্ন প্রকাশ করার জন্য তোমাকে চকোলেট দিবসের শুভেচ্ছা জানাচ্ছি।\n" +
                "শুভ চকোলেট দিন।"));
        list.add(new ShayariData("চকোলেট সহ প্রেমিক না থাকলে প্রেমিকার চেয়ে ভাল আর কিছু হতে পারে না। \n" +
                "শুভ চকোলেট দিন।"));
        list.add(new ShayariData("আমার জীবন যেমন ভালবাসা ও হাসিতে ভরে উঠুক তেমনি তোমার জীবন ভরে উঠুক; এবং মনে রাখবেন, যখন জিনিসগুলি রুক্ষ হয় তখন তোমার প্রয়োজন চকোলেট।\n" +
                "শুভ চকোলেট দিন।"));
        list.add(new ShayariData("যখন আমি এটি তোমার সাথে ভাগ করি তখন একটি চকোলেট অনেক বেশি মিষ্টি হয়।\n" +
                "শুভ চকোলেট দিবস!"));
        list.add(new ShayariData("আরে, এটি চকোলেট দিবস এবং তোমাকে সঠিক সময় বলার জন্য যে আমি কেবল তোমার সাথে সমস্ত কিছু ভাগ করে নিতে ভালবাসি। চকোলেট ছাড়া তোমার মিষ্টির কিছুই মেলে না।\n" +
                "শুভ চকোলেট দিবসে প্রিয়!"));
        list.add(new ShayariData("এই গ্রহে দুটি জিনিসই আমাকে গলে যেতে পারে: আমার বান্ধবীর সুন্দর মুখ এবং চকোলেটগুলির একটি বান্ডিল।\n" +
                "শুভ চকোলেট দিবসে আমার সুন্দরী বান্ধবী!"));
        list.add(new ShayariData("I Dream Only Of You, I Breathe Only For You, My Every Prayer Is For You,I Need No One Else In My Life But You.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("Anyone can catch one’s eye but it takes a special someone, to capture your heart and soul and for me that special someone is you.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("Facebook, Twitter, WhatsApp Tyohar pyaar ka aya hai sang apne khushiya laya hai. Na rahe koi bhi rang feeka kar lete hain pehle kuch muh meetha.\n" +
                "...Happy chocolate day..."));
        list.add(new ShayariData("My Love, you kill me that your soft voice. Every time i hear you whispering in my ears, i feel heavens open up for me. Your soft voice is a charm to my heart.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("You always care for me.\n" +
                "You always support me.\n" +
                "You always love me.\n" +
                "I thank god who gave me such a true loving partner.\n" +
                "You are the love of my life.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("My Happiness Should Be Yours And Your Troubles Should Be Mine. I Will Do Everything That Brings A Smile To Your Face.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("Love is like swallowing hot chocolate before it has cooled off. It takes you by surprise at first, but keeps you warm for a long time.\n" +
                "Happy chocolate day"));
        list.add(new ShayariData("U R Unique,\n" +
                "U R Caring And\n" +
                "U R The Best.\n" +
                "And I Am The Luckiest\n" +
                "To Have You My Love!\n" +
                "Happy Chocolate Day"));
    }

    private void initList4() {
        list.add(new ShayariData("তুমি আমার কাঁধে কাঁদো,\n" +
                "যেমন আমার আগের টেডি ছিল।\n" +
                "আশা করি এই টেডি তোমাকে\n" +
                "একইভাবে সহায়তা করবে।\n" +
                "শুভ টেডি দিবস!"));
        list.add(new ShayariData("তুমি আমার ঠোঁটের হাসি, আমার চোখের পলক, এবং আমার মুখের আনন্দ, তুমি ছাড়া আমি কিছুই নই, আমি আশা করি শীঘ্রই তুমি আমার সাথে দেখা হবে ভালবাসা!\n" +
                "শুভ টেডি বিয়ার ডে"));
        list.add(new ShayariData("তুমি সর্বদা আমার চিন্তায় থাক এবং আমার স্বপ্নে যেখানেই যেতে পার। তুমি টেডি বিয়ার ডেতে সর্বদা আমার হৃদয়ের কাছাকাছি থাক। আমি তোমাকে জানার চেয়েও বেশি ভালবাসি বলতে চাই।\n" +
                "শুভ টেডি বিয়ার ডে"));
        list.add(new ShayariData("আমি যেখানেই যাই বা আমি যা করি তা নির্বিশেষে তুমি সর্বদা আমার চিন্তা এবং অন্তরে রয়েছ। আমি যা করতে চাই তা হল নরম এবং মিষ্টি টেডির মতো তোমাকে যত্ন এবং ভালবাসা। \n" +
                "শুভ টেডি দিন!"));
        list.add(new ShayariData("এমনকি যদি সূর্য জ্বলতে অস্বীকার করে তবে শব্দগুলি ছড়া দিতে অস্বীকার করে তবে তুমি সর্বদা আমার ভালোবাসা হবা।\n" +
                "শুভ টেডি ডে!"));
        list.add(new ShayariData("অবশ্যই আমার প্রিয় টেডি বিয়ার থেকে বা আমার সবচেয়ে প্রিয় প্রেমিকের কাছ থেকে আলিঙ্গনের মতো ভাল কিছুই নেই।\n" +
                "শুভ টেডি ডে প্রিয়া!"));
        list.add(new ShayariData("কে বলেছিল টেডিগুলি বাস্তব নয় মানে তুমি কেবল তোমার দিকে তাকাও !! তুমিই সবচেয়ে আদরের টেডি, আমার ভালবাসা! \n" +
                "শুভ টেডি দিবস!"));
        list.add(new ShayariData("আমার টেডি তোমাকে মনে করিয়ে দেয়। এটি তোমার মতো নরম এবং উষ্ণ। \n" +
                "শুভ টেডি দিবস!"));
        list.add(new ShayariData("একটি সুন্দর টেডি বিয়ার, আমার বুদ্ধিমান বন্ধুর কাছে, একটি সুন্দর উপলক্ষে, শুধু বলার জন্য।\n" +
                "শুভ টেডি বিয়ার ডে!"));
        list.add(new ShayariData("You are soft and cute as a teddy. On the teddy day, I wanna hug you tight and give you a kiss. Happy teddy day"));
        list.add(new ShayariData("\n" +
                "Like your teddy, I want you to hug me tight and spend with me all your nights. Happy teddy day!"));
        list.add(new ShayariData("Happy teddy day to my soft, sweet and cute teddy. You are cuter than the cutest teddy ever.Happy teddy day! "));
        list.add(new ShayariData("I wanna tell you today that you are my best teddy. I miss you every night and every day!Happy teddy day!"));
        list.add(new ShayariData("A teddy is always a best friend who listens to every problem of a person and this will help when I am not there. Happy Teddy Day!"));
        list.add(new ShayariData("You are never alone, you always have my side, my back and a teddy which will always remind you of me. Happy Teddy Day!"));
        list.add(new ShayariData("You are the reason of my happiness and joy. Wishing you a very happy Teddy Day."));
        list.add(new ShayariData("Just like your fluffy Teddy Bear, I also want to be your friend for life and start by your side. Happy Teddy Day!"));
        list.add(new ShayariData("When it comes to giving those awesome teddy bear hugs, no one can match you. I am lucky to have a friend like you. Happy Teddy Day!"));
        list.add(new ShayariData("Even if the sun refuse to shine, the words refuse to rhyme...You will always be my valentine. Love you sweetheart... Happy Teddy Day!"));
        list.add(new ShayariData("Sending you a replica of me to hug, adore and kiss... Happy Teddy Day!"));
        list.add(new ShayariData("You are my l'il chubby doll and I am your teddy bear!!... Miss me baby... Happy Teddy Day!"));
    }

    private void initList5() {
        list.add(new ShayariData("কেউ আপনাকে কখনও আঘাত করবে না বলে প্রতিশ্রুতি দিলে কখনও বিশ্বাস করবেন না । মনে রাখবেন, কখনো কেউ এই প্রতিশ্রুতি চিরকাল ধরে রাখতে পারে না ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("আমি তোমাকে ভালোবাসার প্রতিজ্ঞা করতে পারি না, তবে ভালো রাখার প্রতিজ্ঞা করতেই পারি ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("আমি সবসময় হাসির প্রতিশ্রুতি দিতে পারবো না, কারণ জীবনের কোন না কোন সময়ে মানুষকে কাঁদতে হয়ই ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("প্রতিশ্রুতি বিশ্বাসের মতো, এটি রাখতে না পারলে কখনও কারো সাথে প্রতিশ্রুতিবদ্ধ না হওয়াই ভালো ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("প্রমিস করে ভালোবাসা হয় না, কারণ ভালোবাসায় কোন শর্ত থাকে না ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("কথা দিয়ে কথা না রাখার চেয়ে, কোন প্রমিস না করাই ভালো ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("\n" +
                "ভালোবাসতে প্রমিস করতে হয় না, ভালোবাসাটাই হলো একটা প্রমিস ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("কাউকে এমন কোন বিষয়ে প্রমিস করো না, যে প্রমিস তুমি রাখতে পারবে ।\n" +
                "হ্যাপি প্রমিস ডে\n"));
        list.add(new ShayariData("কাউকে এমন কোন আশা দেখাবা না, যে আশা তুমি পুরন করে দিতে পারবে না ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("প্রমিস করে কখনো সম্পর্ক টিকে থাকে না, সম্পর্ক টিকে থাকে একের প্রতি অন্যের সহমর্মিতা থেকে ।\n" +
                "হ্যাপি প্রমিস ডে"));
        list.add(new ShayariData("প্রমিস কি? প্রমিস এমন একটি যা ভাঙা হয় না এবং কখনও আলাদা হয় না। \n" +
                "শুভ প্রমিস দিবস"));
        list.add(new ShayariData("প্রেম আজকের সুখ, এবং আগামীকাল প্রমিস, সুতরাং এই উষ্ণ নোটটি তোমার কাছে আসে, বলার জন্য যে লাইভ লাইফ অফ হূদয়ে পূর্ণ ভালোবাসা।\n" +
                "শুভ প্রমিস দিবস…"));
        list.add(new ShayariData("জীবনে সর্বদা তিনটি বিষয়ের যত্ন নিন:\n" +
                "1) ভরসা\n" +
                "2) প্রমিস\n" +
                "3) সম্পর্ক "));
        list.add(new ShayariData("আমি তোমাকে ছাড়া এটি জীবন কল্পনা করতে পারি না, আমি তোমার সাথে আমার জীবন কাটাতে চাই, আসুন আমরা আমাদের বাকী জীবন একসাথে কাটিয়ে আসি।\n" +
                "শুভ প্রমিস দিবস!"));
        list.add(new ShayariData("কিছুই আমাদের আলাদা করতে পারে না, এমনকি মৃত্যুও নয়।\n" +
                "শুভ প্রমিস দিবস."));
        list.add(new ShayariData("\n" +
                "অহং ছাড়া কথা বলা,\n" +
                "উদ্দেশ্য ছাড়াই প্রেম,\n" +
                "প্রত্যাশা ছাড়াই যত্নশীল,\n" +
                "আমি প্রমিস দিয়েছি যে\n" +
                "তুমি সর্বদা আমার থাকবে।\n" +
                "শুভ প্রমিস দিবস"));
        list.add(new ShayariData("প্রমিস, আমাকে কখনই কাঁদাবে না পরিস্থিতি যাই হোক না কেন, তুমি আমাকে তোমার চোখে লুকিয়ে রাখবে বিশ্বের আর কাউকে দেখাবে না।\n" +
                "শুভ প্রমিস দিবস\n"));
        list.add(new ShayariData("আমি তোমাকে কথা দিচ্ছি আমি তোমাকে সর্বদা ভালবাসবো, আমি তোমার যত্ন নেব এবং তুমি যখন আমার সাথে থাকবে না আমি তোমাকে মিস করব। \n" +
                "শুভ প্রমিস দিন"));
        list.add(new ShayariData("আমি নিজেকে ভাগ্যবান বলে বিবেচনা করব যদি আমি তোমাকে যতটা আনন্দ দিয়েছি তার অর্ধেক সুখ দিতে পারি।\n" +
                "শুভ প্রমিস দিবস."));
    }

    private void initList6() {
        list.add(new ShayariData("এই মন চায় শুধু তোমায় ভালোবাসি\n" +
                "এই মন চায় শুধু তোমার কাছে আসি\n" +
                "এই মন চায় শুধু তোমার মুখের হাসি\n" +
                "এই মন চায় শুধু থাকতে তোমার পাশাপাশি….\n" +
                " “”” Happy Hug Day “””"));
        list.add(new ShayariData("আমার এই অপূর্ণ জীবনে তুমি কি আসবে\n" +
                "জীবনটা পূর্ণ করে একটু ভালোবাসবে\n" +
                "আর কিছু চাইবো না একটু ভালোবাসবো\n" +
                "আজকের শুভ দিনটাতে একটু কাছে আসবো।।\n" +
                "“””” Happy Hug Day “””"));
        list.add(new ShayariData("সময় তো অনেক হয় গোধূলির মতো নয়\n" +
                "চাঁদ তো অনেক হয় পূর্ণিমার মতো নয়\n" +
                "ঋতু তো অনেক হয় বসন্তের মতো নয়\n" +
                "বন্ধু তো অনেক হয় তোমার মত নয়…।\n" +
                "* Happy Hug Day*"));
        list.add(new ShayariData("চোখের কি দোষ বলো\n" +
                "ভালো লাগে তোমাকে,\n" +
                "মনের কি দোষ বলো\n" +
                "ভালোবাসি তোমাকে..\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("দূরে গেলে তুমি হারিয়ে যাবে আমি,\n" +
                "ভালোবাসি তোমায় বুঝনা কেন তুমি?\n" +
                "ছোট্ট এই জীবনে একটাই শুধু চাওয়া\n" +
                "তোমাকে আপন করে আমার শুধু পাওয়া…।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("কৃষ্ণচূড়া রাধাচূড়া আমি অনেক দেখেছি\n" +
                "সব ভুলেছি যেদিন তোমার প্রেমে মজেছি।\n" +
                "Happy Hug Day"));
        list.add(new ShayariData("আমায় তুমি ভালোবাসো\n" +
                "আমিও কি কম?\n" +
                "সমান্তরাল ভালোবাসা\n" +
                "চলছে হরদম।\n" +
                "* Happy Hug Day*"));
        list.add(new ShayariData("মনের ঘরেতে বাজছে এলার্ম হয়েছে সময়\n" +
                "ভেতর থেকে বলছে হৃদয় আজ ভালোবাসি তোমায়।\n" +
                "Happy Hug Day *"));
        list.add(new ShayariData("মনের আকাশ হয়ে রয়েছো ছড়িয়ে\n" +
                "বলোনা কোথায় রাখি তোমায় লুকিয়ে\n" +
                "থাকি যে বিভোর হয়ে স্বয়নে স্বপনে\n" +
                "যেওনা হৃদয় থেকে দূরে হারিয়ে\n" +
                "আমি যে ভালোবাসি শুধু তোমাকে।\n" +
                "* Happy Hug Day*"));
        list.add(new ShayariData("ফুল লাল পাতা সবুজ মন কেন এত অবুঝ\n" +
                "কথা কম কাজ বেশি মন চায়\n" +
                "তোমার কাছে আসি।।\n" +
                "** Happy Hug Day ***"));
        list.add(new ShayariData("তুমি আমার রঙিন স্বপ্ন\n" +
                "শিল্পীর রং এ ছবি\n" +
                "তুমি আমার চাঁদের আলো\n" +
                "সকাল বেলার রবি\n" +
                "তুমি আমার নদীর মাঝে\n" +
                "একটি মাত্র কুল\n" +
                "তুমি আমার ভালোবাসার\n" +
                "শিউলি বকুল ফুল।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("যত দূরে যাওনা কেন আছি তোমার পাশে\n" +
                "তাকিয়ে দেখো আকাশপানে ঘুম যদি না আসে\n" +
                "কাছে আমায় পাবে তুমি হাত বাড়ালেই যেই\n" +
                "যদি না পাও জানবে সেদিন আমি যে আর নেই।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("আজ এই দিনটাকে মনের খাতায় লিখে রাখো \n" +
                "আমায় পড়বে মনে কাছে দূরে যেখানেই থাকো।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("কি করছো, কোথায় যাচ্ছ, কেন যাচ্ছ\n" +
                "কার সাথে যাচ্ছ, তোমার ফোন ওয়েটিং কেন\n" +
                "কে ফোন করেছিল, কার সাথে কথা বলছো….\n" +
                "না.. এটা সন্দেহ না…. এটাই ভালোবাসা।।।।\n" +
                "“””” Happy Hug Day “”””"));
        list.add(new ShayariData("কোথাও যদি কোথাও আকাশ\n" +
                "সীমানার বাইরে সমুদ্রের বাতাস\n" +
                "আলো সজীবতা মিশেছে যেথায়\n" +
                "আধার জোছনা ঢেকেছে সেথায়\n" +
                "আমি দাঁড়িয়ে আছি তোমার অপেক্ষায়\n" +
                "ক্ষণিক এসে কাটাই নীরবতায়….।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("সুন্দর জামা পড়লেই চেহারা সুন্দর থাকলেই\n" +
                "স্মার্ট হলেই ভালোবাসা পাওয়া যায় না…….\n" +
                "ভালবাসতে হলে সুন্দর মন থাকতে হবে……\n" +
                "হিংসা বিবাদ মিথ্যা বাদ দিয়ে বিশ্বাস নিয়ে….\n" +
                "মনের দরজা খুলে থাকার নাম ভালবাসা।।।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("দুটি পাখির একটি নীড়\n" +
                "একটি নদীর দুটি তীর\n" +
                "দুটি মনের একটি আশা\n" +
                "তার নাম ভালোবাসা।।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("ভালোবাসার বন্ধন তোমার আমার মাঝে\n" +
                "দুঃখে সুখে বর্ষা বসন্তের\n" +
                "গ্রীষ্মের প্রখর দিনে, শীতের অলস দুপুরে\n" +
                "বারো মাসে তেরো পার্বণে\n" +
                "পাশে আছি পাশে থাকবো চিরবন্ধু হয়ে।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("ভাসি ডুবি তোমার টানে\n" +
                "তুমি জলে–স্থলে ওগো!\n" +
                "আমার ছুঁয়ে যাও ভেজা পায়।।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("আমার আনন্দ বেদনায় প্রতি পলকে\n" +
                "জড়িয়ে আছো তুমি\n" +
                "তুমি ছাড়া এ হৃদয় যেন ধুধু মরুভূমি\n" +
                "“” Happy Hug Day “”"));
        list.add(new ShayariData("খুঁজিনি কারো মন,\n" +
                "তোমার মন পাবো বলে!\n" +
                "ধরিনি কারো হাত,\n" +
                "তোমার হাত ধরবো বলে!\n" +
                "হাঁটিনি কারো সাথে,\n" +
                "তোমার সাথে হাঁটবো বলে!\n" +
                "কাউকে বাসিনি ভালো,\n" +
                "তোমাকে ভালোবাসি বলে..\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("ভালোবাসা শব্দটা হয় না কখনো পুরানো\n" +
                "হয় না কখনো মলিন, হয় না ধূসর কিংবা বর্নহীণ!\n" +
                "যা শুধু রংধনুর রঙে রঙিন\n" +
                "হোকনা সেটা এপার কিংবা ওপারের\n" +
                "তারপরেও ভালোবাসা তো শুধুই ভালোবাসা।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("শুভক্ষণ শুভদিন মনে রেখো চিরদিন\n" +
                "কষ্ট গুলো দূরে রেখ স্বপ্নগুলো পূরণ করো\n" +
                "নতুন ভালো স্বপ্ন দেখো আমার কথা মনে রেখো।।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("ভালোবাসি বাগানের ঝরে যাওয়া ফুল\n" +
                "ভালোবাসি মেঘলা নদীর কূল…..\n" +
                "ভালোবাসা উড়ন্ত এক ঝাঁক পাখি\n" +
                "আর ভালবাসি তোমার ওই দুটি আঁখি।।\n" +
                "“”” Happy Hug Day “””"));
        list.add(new ShayariData("জানিনা আমার এই মন\n" +
                "কার জন্য অপেক্ষায় আছে\n" +
                "জানিনা কার মনে আমার জায়গা হবে\n" +
                "শুধু জানি আমার এ মন তার জন্য\n" +
                "যে আমাকে সারাজীবন ভালবাসবে।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("শুনেছ তুমি একটি কথা\n" +
                "আজ নাকি.. ” Hug Day ”\n" +
                "কিনে নেব সুন্দর ফুল\n" +
                "তোমাকে দিতে,\n" +
                "আমি করবো নাকো ভুল\n" +
                "ফুল হচ্ছে ভালোবাসার প্রতীক\n" +
                "এই সময়ে দেওয়াই সঠিক।।\n" +
                "“” Happy Hug Day “”"));
        list.add(new ShayariData("টাকা নাই যে গিফট কিনব\n" +
                "পয়সা নাই যে ফুল কিনব\n" +
                "শুধু রয়েছ আমার এ….\n" +
                "ছোট্ট মনের ছোট্ট ভালোবাসা\n" +
                "সাথে পাঠিয়ে দিলাম আমার এই sms খানা।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("মনের মধ্যে প্রবাহমান ঝরনা\n" +
                "এনে দিলো ভালোবাসার বন্যা\n" +
                "ভাসিয়ে নিলো বিসৃতির ভেলা\n" +
                "শুরু হলো ভালোবাসার খেলা।।\n" +
                "* Happy Hug Day *"));
        list.add(new ShayariData("আমি নদী তুমি সাগর\n" +
                "আমি মিশবো তোমার বুকে\n" +
                "প্রাণপ্রিয়সী সখি আমার\n" +
                "দাও সারা আমার ডাকে।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("কথা দাও কথা দাও আবার আসবে\n" +
                "এমনি করেই ভালবাসবে\n" +
                "আমার এমন ভাবে জড়িয়ে ধরবে।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("একজনমের ছোট্ট এই জীবন\n" +
                "এত কম ভালোবেসে\n" +
                "আমার মন ও ভরে না\n" +
                "ওগো প্রাণ ও ভরে না।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("চলো না গো এই শহর ছেড়ে\n" +
                "দূর কোন এক পাহাড়ি দেশে\n" +
                "যেথায় নীল আকাশের নীচে\n" +
                "শুধু তোমার আমার হৃদয় মেশে।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("তোমার নীল দোপাটি চোখ\n" +
                "আর মিষ্টি মিষ্টি হাসি\n" +
                "এলোচুলে চেয়ে দেখো\n" +
                "আমি বড্ড ভালোবাসি।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("সোহাগ চাঁদ বদনী ধনি আমার\n" +
                "তুমি পূর্ণিমার জোছনা\n" +
                "আলোয় আলোয় ভরিয়ে দিলে\n" +
                "এ জীবন তোমার নেইকো কোন তুলনা।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("এসো এসো গো প্রাণেশ্বরী দয়া করে\n" +
                "দাও গো আবার সোহাগ চুম্বন\n" +
                "তোমার আমার ভালোবাসা যে চিরকালের\n" +
                "কোনদিন ছিড়বে না এই বন্ধন।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("এতকিছু সোহাগ জানিয়েছিলে তুমি\n" +
                "মোর কাছে নয় সে সামান্য দান\n" +
                "সেইটুকুই আমার স্বর্গ সুরভী\n" +
                "ভরিয়ে দিয়েছো এ দেহ মন আর প্রাণ\n" +
                "* Happy hug day *   "));
        list.add(new ShayariData("অনেক এসএমএস পেয়েছি আমি\n" +
                "আর মন ভরে না\n" +
                "এবার চিরসঙ্গী হবে তুমি\n" +
                "এই মনোবাসনা।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("আজ হোলির দিনে তুমি কি\n" +
                "SMS এর রঙ লাগালে মুখে\n" +
                "তুমি না কাছে থাকলে বল\n" +
                "পারি কি থাকতে সুখে।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("মৌবনে এবার মৌ জমেছে\n" +
                "SMSবলছে ডেকে ডেকে\n" +
                "আর কৃষককে ভ্রমরের মন\n" +
                "দূরে দূরে থাকে।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("আমার বুকের ভেতর কত\n" +
                "শায়েরী হয়ে আছে জমা\n" +
                "তাইতো এসএমএসে ডাকছি\n" +
                "তোমায় আমার মনোরোমা।।\n" +
                "* Happy hug day *"));
        list.add(new ShayariData("ফুলশয্যার ঘরে তোমায় বুকে বন্দি করে\n" +
                "সারারাত কাটাবো আমি\n" +
                "তোমায় আদর করে।।\n" +
                " “””” Happy hug day “”””"));
        list.add(new ShayariData("প্রেমের সাহেরি স্রোতে আমি হাসতে ভালোবাসি\n" +
                "তাইতো তোমায় SMSনা করেই ছুটে ছুটে আসি\n" +
                "“”” Happy hug day ‘””"));
        list.add(new ShayariData("প্রিয়সি আমার প্রাণেশ্বরী দাও গো একটু দেখা\n" +
                "কেন করেছে বিধাতা তোমার মুখখানি মধু মাখা?\n" +
                "“””” Happy hug day “””“"));
        list.add(new ShayariData("তুমি আমার প্রেমের দেবী তা কি তুমি জানো\n" +
                "তুমি ছাড়া যে অচল আমি তা নিশ্চয়ই মানো।\n" +
                "“”””” Happy hug day “”””””"));
        list.add(new ShayariData("তুমি ছাড়া বৃথা আমার এই ভড়ন্ত যৌবন\n" +
                "SMS এর মাধ্যমে তোমায় জানাই আলিঙ্গন।।\n" +
                " “”” Happy hug day “”””"));
    }

    private void initList7() {
        list.add(new ShayariData("আজকের দিন তাকে ধরে রাখবার মতো ইচ্ছে হয়,\n" +
                "তোমাকে যে আমার কিস করতে ইচ্ছে হয়.\n" +
                "Happy Kiss Day My Love !!"));
        list.add(new ShayariData("তোমার সুরের বাঁশি,\n" +
                "আমার হৃদয়ের টান.\n" +
                "তোমার আমার অভিমান,\n" +
                "দু জনাতে কিস করে\n" +
                "শান্ত হবে মন প্রান.\n" +
                "Happy Kiss Day My Love !!"));
        list.add(new ShayariData("নতুন বছর পরে গেলো,\n" +
                "ওগো মোর প্রিয়…..\n" +
                "তোমাকে  কিস করে ,\n" +
                "আমার মন প্রান জুড়ালো..\n" +
                "Happy Kiss Day My Love !!"));
        list.add(new ShayariData("সারাদিন কাজের ফাঁকেই  তোমার কাছে যাই\n" +
                "তোমাকে জড়িয়ে ধরে কিস করতে চাই….\n" +
                "Happy Kiss Day My Love !!"));
        list.add(new ShayariData("ও দাদার শালী  আমাকে কেনো কাছে ডাকলি,\n" +
                "কিস করতে দিয়ে আমার মনটা কেড়ে নিলি.\n" +
                "Happy Kiss Day My Love !"));
        list.add(new ShayariData("Life is a book we all read it. Luv is a blessing we all need it. Always be happy, always have a smile coz. Remember in this world we are just for a while!!!! \n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Why do we close our eyes wen we sleep - wen we dream, wen we kiss? This is becoz the most precious thing in the world is unseen. When i close my eyes i see you!!!! \n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("U want & u get, that's luck, U want & u wait, that's time. U want but u compromise, that's life. And U want & u wait & u don't compromise that's LOVE...\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("We cannot be together, But we'll never be apart, For no matter what life brings us, You’re always in my heart.... \n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Feelings are many but words are few, clouds are dark but sky is blue; Luv is a paper, life is glue, every thing is false, only My Luv is TRUE....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Love is a medicine for any kind of wound, but there is no medicine found in the world for a wound given by love....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("When it hurts to look back and you are scared to look ahead look beside you I'll always be there 4 you....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("I love the way you make me happy, and the ways you show your care. I love the way you say, 'I Love You,' and the way you're always there!!!!\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Little keys can open big locks, simple words can express great thoughts. A text from u never fails to make me smile the whole day through.\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("If I were to describe true luv then I would describe it as what a snowman did to a snowwoman: He gave her warm hug n they both melted in each other’s arms.... \n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("If I could give u one thing in life, I would give u the ability to see yourself through my eyes, only then would u realise how special u r to me....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Hearts could only luv 4 a while u can put many relations in a file, u can make a desert from the Nile, but u can’t stop my smile when I c ur name on my phone....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Never waste an opportunity 2 say 'I love U' to someone u really like, coz it is not everyday u'll meet the person who has the magic to let u fall in love.\n" +
                "Happy KIss Day"));
        list.add(new ShayariData("I looked at a sweet, beautiful rose, and then I looked at you, and I kept looking at you, for the rose isn't as beautiful as you. 2...\n" +
                "Happy KIss Day"));
        list.add(new ShayariData("Sometimes my eyes get jealous of my heart. Know why? Coz you always remain close to my heart and far from my eyes....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Let love be the guide to your dreams, let love be the light to your heart, let your love be the reason why somebody else's heart still continues to beat.\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("If loving u is wrong, then I don't wanna be right. My luv for u is strong & brighter than any light. The way we must go is long but we'll win every fight....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Another month, another year, another smile, another tear, another winter, another summer too but there will never be another you!!!! \n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("You put the fun in together, The sad in apart, The hope in tomorrow, The joy in my heart....\n" +
                "Happy KIss Day"));
        list.add(new ShayariData("What is the difference between blood and you? Blood enters the heart and flows out but you entered the heart and stayed....\n" +
                "Happy Kiss Day"));
        list.add(new ShayariData("Loving is not how u forget but how u forgive, not how u listen but how u understand, not what u see but how u feel & not how u let go but how u hold on. \n" +
                "Happy KIss Day"));
        list.add(new ShayariData("When we were kids, we couldn't wait to grow up n fall in luv. Now that we are grown up, we realise that wounded knees were easier to heal than broken hearts..... \n" +
                "Happy KIss Day"));
        list.add(new ShayariData("Find arms that will hold u at ur weakest, eyes that will c u at ur ugliest, heart that will luv at ur worst, if u hv found it, u've found luv....\n" +
                "Happy KIss Day"));
    }

    private void initList8() {
        list.add(new ShayariData("তোমাকে ভেবে পৃথিবী আমার অদেখা তবু এঁকে যাই,\n" +
                "আমার ভেতর শুধু তুমি আর তো কিছু পায়নি ঠাই ।\n" +
                "**** হ্যাপি ভ্যালেন্টাইন ডে ****"));
        list.add(new ShayariData("মনের মধ্যে প্রবহমান ঝর্না এনে দিলো ভালোবাসার বন্যা,\n" +
                "ভাসিয়ে নিলো বিস্রিতির ভেলা শুরু হলো ভালোবাসার খেলা ।\n" +
                "((( হ্যাপি ভ্যালেন্টাইন ডে )))"));
        list.add(new ShayariData("তোমার জন্য স্বপ্ন দেখি তুমি আসবে বলে,\n" +
                "তোমার জন্য অপেক্ষায় আছি তুমি\n" +
                "ভালোবাসবে বলে ।\n" +
                "@@@ হ্যাপি ভ্যালেন্টাইন ডে @@@"));
        list.add(new ShayariData("তুমি সন্ধ্যা আকাশের সুখ তারা\n" +
                "রাতের আকাশে জসনা হয়ে দিও আমায় পাহারা\n" +
                "তুমি ভোরের স্নিগ্ধ মাতাল হাওয়া\n" +
                "যার স্পর্শে আমি হয়ে যাই দিশে হারা ।\n" +
                "(( শুভ ভালোবাসা দিবস ))"));
        list.add(new ShayariData("তোমার এক চোখে রোদের আকাশ, অন্য চোখে ছায়া,\n" +
                "তোমার জন্য বুকের ভেতর বাড়ছে শুধু মায়া,\n" +
                "হৃদয় জুড়ে তোমার জন্য স্বপ্ন রাশি রাশি,\n" +
                "আমার চেয়ে তোমায় আমি বেশী ভালোবাসি ।\n" +
                "জানাই ভালোবাসা দিবসের শুভেচ্ছা ।"));
        list.add(new ShayariData("ღ_ღ_ মনেতে আকাশ হয়ে রয়েছো ছড়িয়ে,\n" +
                "বলনা কোথায় রাখি তোমায় লুকিয়ে ।\n" +
                "থাকি যে বিভোর হয়ে শয়নে স্বপনে ॥\n" +
                "যেও না হৃদয় থেকে দূরে হারিয়ে,\n" +
                "আমি যে ভালবাসি শুধু-ই তোমাকে ॥\n" +
                "❃ღღ_Happy Valentines day_ღღ❃"));
        list.add(new ShayariData("ღ_ღ_ একদিন দুজনে হাঁটব আবার উড়বে তোমার চুল,\n" +
                "একদিন শূন্য বাতাস ছুয়ে যাবে কৃষ্ণচুড়ার ফুল…\n" +
                "❃ღღ_Happy Valentines day_ღღ❃"));
        list.add(new ShayariData("নির্জনে বসে আছি একা\n" +
                "বুঝবে তুমি আমরা মনের ব্যাথা\n" +
                "ভালোবাসার অপরাধে হয় যদি ফাঁসি\n" +
                "তবুও বলবো আমি তোমায় ভালোবাসি\n" +
                "** হ্যাপি ভ্যালেন্টাইন ডে **"));
        list.add(new ShayariData("জানিনা আমার এই মন কার জন্য অপেক্ষায় আছে\n" +
                "জানিনা কার মনে আমার জায়গা হবে\n" +
                "শুধু জানি আমার এ মন তার জন্য\n" +
                "যে আমাকে সারা জীবন ভালোবাসবে ।\n" +
                "ভালোবাসা দিবসের শুভেচ্ছা নিও ।"));
        list.add(new ShayariData("তোমার যদি ভালো লাগে ভোরের ওই আকাশ\n" +
                "তবে তুমি সূর মেলাও পাখির মিষ্টি গানে\n" +
                "তোমার যদি ভালো লাগে মেঘলা ওই আকাশ\n" +
                "তবে তুমি মনকে ভাসাও মেঘের ভেলায়\n" +
                "তোমার যদি ভালো লাগে রাতের ওই আকাশ\n" +
                "তবে তুমি হারিয়ে যাও ওই তারার মেলায়\n" +
                "তোমার যদি ভালো লাগে শুধু আমায়\n" +
                "তবে তুমি চুপি চুপি জানিয়ে দিও তোমার ইশারায় ।।\n" +
                "বিশ্ব ভালোবাসা দিবসের শুভেচ্ছা নিও ।"));
        list.add(new ShayariData("স্বপ্ন ভেঙ্গে গেছে তো কি হয়েছে ?\n" +
                "স্বপ্ন আবার দেখো\n" +
                "মনের মানুষ চলে গেছে তো কি হয়ছে ?\n" +
                "মনের দরজা খুলে আবার বসে থাকবো\n" +
                "কেউ না কেউ তো আসবে আমার জীবনে\n" +
                "ভালোবাসার কথা বলবে আমাকে ।\n" +
                "বিশ্ব ভালোবাসা দিবসের শুভেচ্ছা নিও ।"));
        list.add(new ShayariData("ভালোবাসি তোমায় আমি বলবো কতবার\n" +
                "বুঝালেও কেনো বুঝতে চাও না বলো একবার\n" +
                "ভালোবাসি তোমায় আমি আমার জীবনের চেয়ে বেশী\n" +
                "প্লিজ আমাকে বুঝতে চেষ্টা করো জান ।\n" +
                "রবিশ্ব ভালোবাসা দিবসের শুভেচ্ছা নিও ।"));
        list.add(new ShayariData("তোমায় ভালোবাসা ছিলো আমার জীবনের ২য় শ্রেষ্ঠ কাজ ,\n" +
                "আর প্রথমটি ছিলো তোমায় খুজে বের করা ।\n" +
                "ভালোবাসি তোমায় এবং সবসময় বাসবো ,\n" +
                "আজ বললাম ও সারা জীবন বলবো ।\n" +
                "*** হ্যাপি ভ্যালেনটাইন ডে ***"));
        list.add(new ShayariData("আমি তোমাকে চাই কল্পনাতে নয় বাস্তবে,\n" +
                "আমি তোমাকে চাই চলনাতে নয় ভালোবাসায় ,\n" +
                "আমি তোমাকে চাই তোমার মত করে নয় আমার মত করে ,\n" +
                "আমি তোমাকে চাই ক্ষনিকের জন্য নয় চিরদিনের জন্য ।\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে"));
        list.add(new ShayariData("মন যদি আকাশ হতো, তুমি হতে চাঁদ ,\n" +
                "ভালোবেসে যেতাম শুধু, হাতে রেখে হাত ।\n" +
                "সুখ যদি হৃদয় হতো তুমি হতে হাসি ,\n" +
                "হৃদয়ের দুয়ার খুলে দিয়ে বলতাম – তোমায় ভালোবাসি ।\n" +
                " ভালোবাসা দিবসের শুভেচ্ছা "));
        list.add(new ShayariData("একদিন দুজন হাঁটবো আবার উড়বে তোমার চুল,\n" +
                "একদিন শূন্য বাতাস ছুঁয়ে যাবে কৃষ্ণচূড়ার ফুল ,\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে"));
        list.add(new ShayariData("ভালোবাসা বুকের ভেতর হয়েছে নিঃশ্বাস ,\n" +
                "তোমার প্রেমে বেঁচে আছি এইতো বিশ্বাস ,\n" +
                "জান আমার জান, তুমি আমার প্রানের মাঝে প্রান ।\n" +
                "হ্যাপি ভালেন্টাইন্স ডে "));
        list.add(new ShayariData("মনেতে আকাশ হয়ে রয়েছো ছড়িয়ে ,\n" +
                "বলোনা কোথায় রাখি তোমায় লুকিয়ে ,\n" +
                "থাকি যে বিভোর হয়ে শয়নে স্বপনে ,\n" +
                "যেওনা হৃদয় থেকে দূরে হারিয়ে ,\n" +
                "আমি যে ভালোবাসি শুধুই তোমাকে ।\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে "));
        list.add(new ShayariData("ঘড়িতে বাজছে অ্যালার্ম হয়েছে সময়,\n" +
                "ভেতর থেকে বলছে হৃদয় আজ ভালোবাসি তোমায় ।\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে ……"));
        list.add(new ShayariData("টিপ টিপ বৃষ্টি পরে, তোমার কথা মনে পড়ে,\n" +
                "এ মন না থাকে ঘরে, জানিনা তুমি আসবে কবে,\n" +
                "এ প্রান শুধু তোমায় ডাকে , আমায় ভালবাসবে বলে,\n" +
                "ফুল হাতে থাকবো দাঁড়িয়ে বলবো আমি তোমায় পেয়ে,\n" +
                "সাত সমুদ্র পাড়ি দিয়ে পেয়েছি তোমায় খুজে।\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে …।।"));
        list.add(new ShayariData("তোমাকে ভেবে পৃথিবী আমার অদেখা তবু এঁকে যাই,\n" +
                "আমার ভেতর শুধু তুমি আর তো কিছু পায়নি ঠাই ।\n" +
                "**** হ্যাপি ভ্যালেন্টাইন ডে ****"));
        list.add(new ShayariData("মনের মধ্যে প্রবহমান ঝর্না এনে দিলো ভালোবাসার বন্যা,\n" +
                "ভাসিয়ে নিলো বিস্রিতির ভেলা শুরু হলো ভালোবাসার খেলা ।\n" +
                "((( হ্যাপি ভ্যালেন্টাইন ডে )))"));
        list.add(new ShayariData("তোমার জন্য স্বপ্ন দেখি তুমি আসবে বলে,\n" +
                "তোমার জন্য অপেক্ষায় আছি তুমি\n" +
                "ভালোবাসবে বলে ।\n" +
                "হ্যাপি ভ্যালেন্টাইন ডে"));
        list.add(new ShayariData("যে কথা যায়না বলা, শুধু মনে বোঝা যায়, এমন মনের মানুষ খুঁজছি আমি তারে পাবোগো কোথায়।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তোমার জন্য স্বপ্ন দেখি তুমি আসবে বলে, তোমার জন্য অপেক্ষায় আছি তুমি ভালোবাসবে বলে। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তোমার থেকে দূরে গেলে মন মানে না, এতো ভালোবাসি তোমায় তুমি বোঝো না! \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("প্রেমের পথে চলতে গেলে বাধা অনেক পাবে, রাখো কাছে এস.এম.এস. তোমায় ভালো পথ দেখাবে। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("কবিতার উপমায় খুঁজিনি তোমায়, খুঁজিনি গানের শুরে, জানি তুমি আছো শুধু আমার এ হৃদয় জুড়ে, হাজারো প্রশ্নের একটাই এনসার, আর কারো নয়, তুমি শুধুই আমার। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("যদি আসিস বন্ধু একবার তুই আমার জীবনে, সারা জীবন বাসবো ভালো আমি তোরে, বুকের মাঝে থাকবিরে তুই জনম জনম ধরে, জীবন মরণ দিয়ে আমি বাসবো ভালো তোরে। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তোমাকে ভেবে পৃথিবী আমার অদেখা তবু এঁকে যাই, আমার ভেতর শুধু তুমি আর তো কিছু পায়নি ঠাই । \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("প্রিয়ার বাবা বিয়ের কথায় দেয়নি অনুমুতি, মেজাজ গরম করে প্রেমিক মুখ ফেরাল দ্রুতগতি! \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("চাঁদ তুমি যেমন রাতকে ভালোবাস আমিও ঠিক তেমনি ই করে একজনকে ভালোবাসি তোমার ভালোবাসা যেমন কেউ বুঝে না ঠিক তেমনই করে, আমার ভালোবাসা বুঝে না। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("এক কোটি বছর আগে জন্মেছিলো তোমার জন্য ভালোবাসা, এখনো অপেক্ষা করে আছি, তুমি ভালোবাসবে বলে, তোমাকে ধরতে আসেনি এসেছি ধরা দিতে। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তুমি সন্ধ্যা আকাশের সুখ তারা, রাতের আকাশে জসনা হয়ে দিও আমায় পাহারা, তুমি ভোরের স্নিগ্ধ মাতাল হাওয়া, যার স্পর্শে আমি হয়ে যাই দিশে হারা। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("যেমন ছিলাম আগে আমি, তেমনি তো আছি, আজে বাজে বকছো শুধু ভুল বুঝে মিছি মিছি। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("মনের মধ্যে প্রবহমান ঝর্না এনে দিলো ভালোবাসার বন্যা, ভাসিয়ে নিলো বিস্রিতির ভেলা শুরু হলো ভালোবাসার খেলা। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("মনি মুক্তা হিরে দিয়ে গড়িয়ে দিবো গয়না, একটি চুমো দাওগো প্রিয় মুখ ফিরিয়ে নিওনা। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~\n"));
        list.add(new ShayariData("একটু একটু প্রেম আর একটু একটু সুখ, এই ভালোবাসা পেয়ে ভোরে যাক আমার বুক। অনেক সাধনার পর পেয়েছি তোমায়, তাই তোমাকে আর হারাতে চাইনা কোনো অবেলায়। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তোমার বিরহে যখন আমার কাটে নাকো সময়, তখনই তো এস.এম.এস. আমার মন প্রান ভুলিয়ে দেয়! \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("জানি নাকো মন ছাড়া আমি আর কি দেবো তোমায়, দেহতো দিয়েছি আগেই বলো এবার কি উপায়। \n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~\n"));
        list.add(new ShayariData("মনের মধ্যে প্রবহমান ঝর্না, এনে দিলো ভালোবাসার বন্যা, ভাসিয়ে নিলো বিস্রিতির ভেলা, শুরু হলো ভালোবাসার খেলা ।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তোমার জন্য স্বপ্ন দেখি তুমি আসবে বলে, তোমার জন্য অপেক্ষায় আছি তুমি ভালোবাসবে বলে ।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("তুমি সন্ধ্যা আকাশের সুখ তারা, রাতের আকাশে জসনা হয়ে দিও আমায় পাহারা, তুমি ভোরের স্নিগ্ধ মাতাল হাওয়া যার স্পর্শে আমি হয়ে যাই দিশে হারা।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("দূরে গেলে তুমি হারিয়ে যাবো আমি, ভালোবাসি তোমায় বুঝ না কেন তুমি? ছোট্ট এই জীবনে একটা শুধু ছোয়া, তোমাকে আপন করে শুধু আমার পাওয়া।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("অবুঝ দুটি মনের মিলন এর নাম ভালোবাসা, তোমাকে নিয়ে আমার যত স্বপ্ন আশা, ভালোবাসার রং দিয়ে সাজিয়ে রাখবো আমাদের বাসা।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("ভালোবাসি তোমায় আমি বলবো কতবার, কেনো বুঝতে চাও না বলো একবার, ভালোবাসি তোমায় আমি আমার জীবনের চেয়ে বেশী, প্লিজ আমাকে বুঝতে চেষ্টা করো জান।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("শান্ত নদীর ঢেউয়ের মাঝে, মনটা শুধু তোমায় খুঁজে। বসে আছি তাই নদীর তীরে, কত যে স্বপ্ন তোমায় ঘিরে,শুধুই আমার হবে সবসময় পাশে রবে।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("হৃদয় এর ভাষা বুঝা বড় দায়, ভুল করে কেউ প্রেমে পড়ে যায়, যদিও এই কথা মিথ্যা নয়, ভালোলাগা শেষে ভালোবাসা হয়। তবুও ভালোলাগা আর ভালোবাসা এক নয়।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("মনের মাঝে তুমি রয়েছোগো সজনী, হৃদয়ের রঙ দিয়ে রাঙ্গাবো তোমার পৃথিবী, আমার এই ছোট্ট মন এর ছোট্ট একটা আশা, তোমায় নিয়ে জীবনের বাকী পথটা চলা।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
        list.add(new ShayariData("নদী চায় চলতে, তাঁরা চায় জ্বলতে, আমার এই মন চাই,  মনের কথা বলতে, কি বলবো? আই লাভ ইউ।\n" +
                "~হ্যাপি ভ্যালেনটাইন ডে~"));
    }
}