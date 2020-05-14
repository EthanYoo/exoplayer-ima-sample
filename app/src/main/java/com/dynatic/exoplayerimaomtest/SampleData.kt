package com.dynatic.exoplayerimaomtest

object SampleData {

    val landingText = "More"
    val ctaTextOnPlaying = "Watch Full Video +3"
    val ctaTextAfterFinished = "Completed"

    val thumbnailUrl = "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"

    val vastTag = """
        <?xml version="1.0"?>
        <VAST version="2.0">
          <Ad id="21623">
            <InLine>
              <AdSystem version="1">Pokkt</AdSystem>
              <AdTitle>20 Sec Video For Test - DNT_Buzzvil</AdTitle>
              <Description>20 Sec Video For Test - DNT_Buzzvil</Description>
              <Error><![CDATA[http://sglptracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=PT_FP&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=PT_BP&language=en&creative_id=29675&platform=android&device_name=android&eap=PT_EAP&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660025&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=c7516fecf88ee8b5246cdb7f61c2950f&utp=UTP&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=[ERRORCODE]&]]></Error>
              <Impression id="pokkt_impression_1"><![CDATA[https://bcp.crwdcntrl.net/5/c=12439/e=app/mid=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff/dt=GAID/int=pokktgeneric/act=pokktimpression]]></Impression>
              <Impression id="pokkt_impression_2"><![CDATA[https://adrta.com/i?clid=pkt&paid=pkt&dvid=v&avid=321&caid=6299&plid=21623&publisherId=8cf3b6ae822e0b0cfe16f8b029cdefc7&lineItemId=29675&kv1=0X0&kv4=184.26.138.26&kv11=158097466002385033805&kv18=com.buzzvil.honeyscreen.tw.new&kv16=0.0&kv17=0.0&kv19=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&kv23=%3F&kv26=android&kv25=Honeyscreen%2BTaiwan&kv27=Mozilla%252F5.0%2B%2528Linux%253B%2BAndroid%2B6.0.1%253B%2BNexus%2B5%2BBuild%252FMOB30H%2529%2BAppleWebKit%252F537.36%2B%2528KHTML%252C%2Blike%2BGecko%2529%2BChrome%252F52.0.2743.98%2BMobile%2BSafari%252F537.36&kv24=Mobile_InApp_Video]]></Impression>
              <Impression id="pokkt_impression"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=6&]]></Impression>
              <Creatives>
                <Creative id="29675" sequence="1" AdID="21623">
                  <Linear>
                    <Duration>00:00:20</Duration>
                    <TrackingEvents>
                      <Tracking event="inAppPurchase"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=24&]]></Tracking>
                      <Tracking event="creativeView"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=31&]]></Tracking>
                      <Tracking event="start"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=7&]]></Tracking>
                      <Tracking event="thirdQuartile"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=3&]]></Tracking>
                      <Tracking event="skip"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=14&]]></Tracking>
                      <Tracking event="mute"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=26&]]></Tracking>
                      <Tracking event="playButtonClick"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=11&]]></Tracking>
                      <Tracking event="loaded"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=95&]]></Tracking>
                      <Tracking event="firstQuartile"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=1&]]></Tracking>
                      <Tracking event="fileError"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=13&]]></Tracking>
                      <Tracking event="midpoint"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=2&]]></Tracking>
                      <Tracking event="unmute"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=27&]]></Tracking>
                      <Tracking event="playError"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=12&]]></Tracking>
                      <Tracking event="complete"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=4&]]></Tracking>
                      <Tracking event="close"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=5&]]></Tracking>
                      <Tracking event="closeLinear"><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=0.0&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=0.2500000118743628&language=en&creative_id=29675&platform=android&device_name=android&eap=1.0000000474974513&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=0&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=5&]]></Tracking>
                    </TrackingEvents>
                    <VideoClicks>
                      <ClickThrough><![CDATA[http://fossilcampaign.com?utm_keyword=pokkt_iprospect_vd-21]]></ClickThrough>
                      <ClickTracking><![CDATA[http://sg-tracker.pokkt.com/api/VideoEventTracker?country=japan&categoryIab=IAB1&city=tokyo&pt_fp=PT_FP&app_bundle_name=com.buzzvil.honeyscreen.tw.new&swidth=600&pt_bp=PT_BP&language=en&creative_id=29675&platform=android&device_name=android&eap=PT_EAP&appId=8cf3b6ae822e0b0cfe16f8b029cdefc7&adpos=0&adv_id=321&state=Tokyo&ml_cache=ML_CACHE&carrier_name=%3F&brand=Google&campaign_id=6299&timestamp=1580974660023&ocr=ML_OCR&vcr=ML_VCR&appName=Honeyscreen+Taiwan&ip=184.26.138.26&limitedTracking=0&advertisingID=a117d5db-e26e-4fb4-a2d4-72112e5bb8ff&offer_id=21623&token=ecaf6b4d7ce1996301d2c2d196eb1deb&utp=UTP&track_id=4d16804b-079d-4f5a-9e88-cdecb2c7fb5f&channel_id=8312&sheight=400&encodedPubParams=&event=9&]]></ClickTracking>
                    </VideoClicks>
                    <MediaFiles>
                      <MediaFile id="pokkt_imp" delivery="progressive" type="video/mp4" bitrate="500" width="600" height="400" scalable="0" maintainAspectRatio="1"><![CDATA[https://d2h452d9fuy6ob.cloudfront.net/1515489624.mp4]]></MediaFile>
                    </MediaFiles>
                  </Linear>
                </Creative>
              </Creatives>
              <Extensions>
                <Extension>
                  <Pokkt>
                    <SkipOffset>00:00:00</SkipOffset>
                    <isOMIDEnabled>0</isOMIDEnabled>
                    <PubPageRedirect/>
                    <Cards/>
                    <NielsenKey/>
                    <NielsenUrl/>
                    <NielsenCI/>
                    <NielsenCA/>
                    <NielsenPlacementId/>
                    <NielsenCreativeId/>
                    <ViewabilityAction>0</ViewabilityAction>
                    <ExtraActions/>
                    <InvalidCachedOfferIds/>
                    <GratificationInfo/>
                    <GratificationTime>0</GratificationTime>
                    <WebViewBaseUrl><![CDATA[http://vdo.pokkt.com]]></WebViewBaseUrl>
                    <ComscoreCampaignId/>
                    <ComscoreCreativeId/>
                    <ComscorePlacementId/>
                    <CoppaEnabled>false</CoppaEnabled>
                    <VideoPlacementType/>
                    <ImaTracking>false</ImaTracking>
                    <AdOverlay>
                      <AdOverlayDimensionRatio><![CDATA[30.0]]></AdOverlayDimensionRatio>
                      <AdOverlayUrl/>
                    </AdOverlay>
                    <Is360Video>false</Is360Video>
                    <HapticFeedback/>
                    <GestureInfo/>
                    <AdditionalWebSettings>
                      <canZoom>false</canZoom>
                      <canOpenExternal>false</canOpenExternal>
                      <canAutoPlay>true</canAutoPlay>
                      <canScroll>false</canScroll>
                      <shouldAskPermission>true</shouldAskPermission>
                    </AdditionalWebSettings>
                  </Pokkt>
                </Extension>
              </Extensions>
            </InLine>
          </Ad>
        </VAST>
    """.trimIndent()

    val tag2 = """
        <?xml version="1.0" encoding="UTF-8"?>
        <VAST xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="vast.xsd" version="3.0">
           <Ad id="697203496">
              <InLine>
                 <AdSystem>GDFP</AdSystem>
                 <AdTitle>External NCA1C1L1 Linear Inline</AdTitle>
                 <Description><![CDATA[External NCA1C1L1 Linear Inline ad]]></Description>
                 <Error><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=videoplayfailed[ERRORCODE]]]></Error>
                 <Impression><![CDATA[https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjsv50TQiOj00MfuWWT9vBcxXGinfyJH50vjU9tD9dee1eNim_SOB-GixbMxEP18slgFRvahZwKqjV70qr5XFAQn9iLf0Ywi51tAJhL6syC0VILhfyUCB1ZE-7fm3LRlbdBwBdVGdQ7DsoVxAcrv7lIU_icnpbXohtbXhqnY622Zp23q7JD1OtJHtx4yFAqbTUVN-_4_t1zIgbnzORPFek8CfL6FRTyDQflXoIJcvQxfbURO0lFD_A_7M1JPm1X__XDWo4xQ12stY4JbwqQd_B7HkT9uhc-7r&sai=AMfl-YSIsyxQO-lVoOuPnEUXhlEhg5qqlM73xukEO9ep-QN4l--eXTW4z9ltm-KzT-AgMK3rFe9wokFWSh0WV0WworYSMXkcrtTpVYIMnSe_-Ej-&sig=Cg0ArKJSzGkLFbBJAXbrEAE&adurl=]]></Impression>
                 <Creatives>
                    <Creative id="57859154776" sequence="1">
                       <Linear>
                          <Duration>00:00:10</Duration>
                          <TrackingEvents>
                             <Tracking event="start"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=part2viewed&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="firstQuartile"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=videoplaytime25&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="midpoint"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=videoplaytime50&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="thirdQuartile"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=videoplaytime75&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="complete"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=videoplaytime100&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="mute"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=admute&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="unmute"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adunmute&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="rewind"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adrewind&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="pause"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adpause&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="resume"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adresume&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="fullscreen"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adfullscreen&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="creativeView"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=vast_creativeview&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="exitFullscreen"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=vast_exit_fullscreen&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="acceptInvitationLinear"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=acceptinvitation&ad_mt=[AD_MT]]]></Tracking>
                             <Tracking event="closeLinear"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=adclose&ad_mt=[AD_MT]]]></Tracking>
                          </TrackingEvents>
                          <VideoClicks>
                             <ClickThrough id="GDFP"><![CDATA[https://pubads.g.doubleclick.net/pcs/click?xai=AKAOjss4lksQmREz06fhta71BDeibff97buml5rhmZUphLNwMC4wRZYAI8mNXCnyTX3RZVsVrPuJoTzYwTevbG18_51hjJtv8-BfdojsTO6aHyz_hpOEp4n-6SfF-lH2FEGJdEjpdqivzPpaWCePDLWDnUrlyOggTdAgTppy6lDWNQjsIMm_jkR4748wnNniCfRK3xs0A6vZ_RB_4hP0P3rG3NDjLI42v8qzbwWl-ZG_eVfkui6N4saEwfrxwv51B4f_tlrBavVNMM81nAss1-XDt_u0OX6c&sai=AMfl-YR8lkVxZh_j_8AwuEMh7OWUN83zpewpavGcU_Vzz2qm6LO4S8ffvD-FgaxVR_exFA9WABkipeywX6U1kZ0Dp215Qnyp3JKgiEgG220Y64iA&sig=Cg0ArKJSzO7UeYINIlU4&adurl=https://developers.google.com/interactive-media-ads/docs/vastinspector_dual]]></ClickThrough>
                          </VideoClicks>
                          <MediaFiles>
                             <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/mp4" bitrate="450" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/15/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/64A89031059198637BA7D9660A5D7C1EC4E8EF60.1661746686CEB6A2D80762F8949A950CA5BE1BED/key/ck2/file/file.mp4]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="176" height="144" type="video/3gpp" bitrate="36" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/17/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/69859EA8A47EC3694D390DF1242EC04558D58472.9198007C65229A8A6D027E207715DC9E877CD5AD/key/ck2/file/file.3gp]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="320" height="180" type="video/3gpp" bitrate="69" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/36/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/B460ED62D204D764376A5318B15A941AA0F2B3B9.8C5FA9D2E0FF4A840AFDEEA830AAC5B79CA4A9A6/key/ck2/file/file.3gp]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="640" height="360" type="video/mp4" bitrate="118" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/18/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/612BF391FEE92104CEAA453880EC4BFA2F52D37A.0FD6C872A95AF9CF962898CC5CA3F863B8099934/key/ck2/file/file.mp4]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="640" height="360" type="video/webm" bitrate="119" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/43/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/2EFA899D8BBF997632EFE219CAEF95EBF365AB32.7674B6750CE0373A765CE6DE16E5DCFB75DF53CA/key/ck2/file/file.webm]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/webm" bitrate="229" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/45/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/7E012D2AEB8E7B0AFD0416DAF91F1B9C0CC95FCD.3AAF0F806C611F5A3E78312E45C10DAA0A38035C/key/ck2/file/file.webm]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="854" height="480" type="video/webm" bitrate="132" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/44/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/A2E84B87A60557C48BA3A6152D5EB9328F3070AC.744F5BA852D8EA5738819BFA6795D223E1E853B3/key/ck2/file/file.webm]]></MediaFile>
                             <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/mp4" bitrate="241" scalable="true" maintainAspectRatio="true"><![CDATA[https://redirector.gvt1.com/videoplayback/id/a33fc5b2685eb16e/itag/22/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585190212/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/16B0697CA3D35F6AC74A02838D2071BCB5263DAA.A1A81409218811C65E8B3BA58FDDCFB073743673/key/ck2/file/file.mp4]]></MediaFile>
                          </MediaFiles>
                       </Linear>
                    </Creative>
                    <Creative id="57857370976" sequence="1">
                       <CompanionAds>
                          <Companion id="57857370976" width="300" height="250">
                             <StaticResource creativeType="image/png"><![CDATA[https://pagead2.googlesyndication.com/pagead/imgad?id=CICAgKDTwILFiwEQrAIY-gEyCAAnmA4d6uc2&b2s=false]]></StaticResource>
                             <TrackingEvents>
                                <Tracking event="creativeView"><![CDATA[https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjssl7PVEJEnISJBDLJ6HapRIVyQ205zVunRxipsdTzaJBktuHa22lChmhtf5iQC-4ohGczlU7FrGJRii-wUi9hvcncwGDZyw1UGQk1-PuZigC1zScMxWhVcrCOfok39SCsIHSTuW1D2MbQKB4zPMVDaNe652POZXGA5tvOdgL01qk0Zw7X2Xx4O5ONYbEwRmLwkPjpUGUq0RzJ5r90fwsxPHZHj5Ye3k2yOofWlOeJSkijwO_bmGmIzcSYOLIJeTgj8GrBr7ckxtyVtLPilQYAoRhKiRLFCe&sai=AMfl-YSLhS91FAXx0Onp13SkAFCJLYXCbkSgGmNYkllO855geQpcHLooSfA7SkVhG5bxZKnXd6wvPnf4x7ek_9HDkqyVIkFC8Uk7MRWvBhTs4BUj&sig=Cg0ArKJSzBug-0Qq1JR9EAE&adurl=]]></Tracking>
                             </TrackingEvents>
                             <CompanionClickThrough><![CDATA[https://pubads.g.doubleclick.net/pcs/click?xai=AKAOjsvX5cRl9BGMQT1JRiEzvXeKclG2LpUzjgasYw54ynEqQHRkB6jKjfulnuW_4XrMWohqu6ID7rm--SbfGOmaBcC3z81f0f8RTXKysKL6q5dEClN5z9GtiIVhg02QvFAlNWdMUciJiPlyTQ-TCzWXA1aSB-xFhWlrvgR4ELncF-y-6p9TQ_5rYegLo61mPUgsHNQRH3psvyo9dM-A5jQBJ6fFlhnvYDryLCFc-RmhoJBUL7HVIgAlfFOecIZ0SJiqVldvTzWOEeCfAsARXkVyQfFGi_7q&sai=AMfl-YREogTZ9ackpJrDlWOd-ca66KOEhA14Su__yo-k_ls5dr6MXsiCpf3K1Cs7YzmYUcV3UNzcTjszwee4BryUBS-Lsi0hAZPZ0aFwqs6Djxbg&sig=Cg0ArKJSzJ1KqPj-KFhl&adurl=https://developers.google.com/interactive-media-ads/docs/vastinspector_dual]]></CompanionClickThrough>
                          </Companion>
                       </CompanionAds>
                    </Creative>
                 </Creatives>
                 <Extensions>
                    <Extension type="waterfall" fallback_index="0" />
                    <Extension type="geo">
                       <Country>KR</Country>
                       <Bandwidth>4</Bandwidth>
                       <BandwidthKbps>20000</BandwidthKbps>
                    </Extension>
                    <Extension type="metrics">
                       <FeEventId>5MB7XuSWGYPZ2ATQnrbgAg</FeEventId>
                       <AdEventId>CO7UtaC9tugCFU64lgodtFsBgQ</AdEventId>
                    </Extension>
                    <Extension type="ShowAdTracking">
                       <CustomTracking>
                          <Tracking event="show_ad"><![CDATA[https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjsugjetCBwoOI_PyYWmp4UFXkWnBrXJdF7Y-qefeNKvEoDD_VzFsRwOQjpCwUm5inh5scjxcPeyoPMmfjcFx2YOArlK7D-nzbG_DB19snU4uGt7Lif1Muj6o6bxnhsSIwO0Z35bNhK9_Tuf04bGErbLBNHBe3wkdpR8Ljr1uS6jyVAzstL3DJQBRNROnxkMeYxk5v1JOjhe1nKib9dwAt9yIt1ghCs7Xj6M1s6TZ_ZU6XfZ2zt17wguh18livXActmhdOa-w_po0FQv1qbDuoT3JDP1K6lMM2l0&sai=AMfl-YSUXZtt3x3KU2XzyXbKN-MBA7DtkpVZO6IgE8ALojp8T2sNioxcSmRmGyWnFwefYwoVfu4nDUh6V3Cabid4ZMaJ3Avrk18Pj-aVkQdB4hu7&sig=Cg0ArKJSzESyRVVRFG89EAE&adurl=]]></Tracking>
                       </CustomTracking>
                    </Extension>
                    <Extension type="video_ad_loaded">
                       <CustomTracking>
                          <Tracking event="loaded"><![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=Bs2i65MB7Xu7SGc7w2gS0t4WICPDYj-sGAAAAEAEgqN27JjgAWNjGssXXAWCbg-mEnCmyARVkZXZlbG9wZXJzLmdvb2dsZS5jb226AQo3Mjh4OTBfeG1syAEF2gFKaHR0cHM6Ly9kZXZlbG9wZXJzLmdvb2dsZS5jb20vaW50ZXJhY3RpdmUtbWVkaWEtYWRzL2RvY3Mvc2Rrcy9hbmRyb2lkL3RhZ3PAAgLgAgDqAiUvMTI0MzE5MDk2L2V4dGVybmFsL3NpbmdsZV9hZF9zYW1wbGVz-AKF0h6AAwGQA-wJmAOsAqgDAeAEAdIFBhCo9rnMAqAGI4gHAZAHAqgH7NUbqAfz0RuoB8LaG9gHAeAHC9IIBggAEAIYHZgLAQ&sigh=aLKMtORVlxM&label=video_ad_loaded]]></Tracking>
                       </CustomTracking>
                    </Extension>
                    <Extension type="AdVerifications">
                        <AdVerifications>
                            <Verification”>
                                <JavaScriptResource apiFramework="omid" browserOptional="true">
                                    <![CDATA[http://110.14.249.89:3000]]>
                                </JavaScriptResource>
                                <TrackingEvents>
                                    <Tracking event="verificationNotExecuted">
                                        <![CDATA[http://110.14.249.89:3000]]>
                                    </Tracking>
                                </TrackingEvents>
                            </Verification>
                        </AdVerifications>
                    </Extension>
                 </Extensions>
              </InLine>
           </Ad>
        </VAST>
    """.trimIndent()

    val tag3 = """
<?xml version="1.0" encoding="UTF-8"?>
<VAST version="3.0">
   <Ad id="24887708073590800" sequence="99">
      <InLine>
         <AdSystem version="1.0">Test Ad Server</AdSystem>
         <AdTitle>Ad Title</AdTitle>
         <Description />
         <Error>http://tr.dawin.tv/err?lid=24887708073590800&amp;cid=24977225812017195&amp;its=2018040511&amp;dmp=N&amp;dmt=1&amp;vt=21&amp;vc=3&amp;oid=24887708073590797&amp;tid=24888903936770050&amp;aaid=41bbb068-d987-4225-a3c2-e3f358899b0b&amp;sca=Game&amp;ge=M&amp;ag=4&amp;mid=2&amp;ast=97211738058915917&amp;idfa=null&amp;key=b6b37cc0-3877-11e8-aa88-03d766aa7ec0</Error>
         <Impression id="1">https://ad-prodmini.buzzvil.com/api/test/tracking?event=impression</Impression>
         <Creatives>
            <Creative>
               <Linear skipoffset="00:00:15">
                  <Duration>00:00:05.000</Duration>
                  <TrackingEvents>
                     <Tracking event="skip">https://ad-prodmini.buzzvil.com/api/test/tracking?event=skip</Tracking>
                     <Tracking event="start">https://ad-prodmini.buzzvil.com/api/test/tracking?event=start</Tracking>
                     <Tracking event="firstQuartile">https://ad-prodmini.buzzvil.com/api/test/tracking?event=firstQuartile</Tracking>
                     <Tracking event="midpoint">https://ad-prodmini.buzzvil.com/api/test/tracking?event=midpoint</Tracking>
                     <Tracking event="thirdQuartile">https://ad-prodmini.buzzvil.com/api/test/tracking?event=thirdQuartile</Tracking>
                     <Tracking event="complete">https://ad-prodmini.buzzvil.com/api/test/tracking?event=complete</Tracking>
                     <Tracking event="progress" offset="00:00:05">https://ad-prodmini.buzzvil.com/api/test/tracking?event=progress</Tracking>
                  </TrackingEvents>
                  <VideoClicks>
                     <ClickThrough id="">https://www.buzzvil.com/</ClickThrough>
                     <ClickTracking id="">https://ad-prodmini.buzzvil.com/api/test/tracking?event=ClickTracking</ClickTracking>
                  </VideoClicks>
                  <MediaFiles>
                     <MediaFile type="video/mp4" width="640" height="360" delivery="progressive" id="24977225812017195" scalable="true" maintainAspectRatio="true">http://ch.dawin.tv/dmpro/360/149/v1499926072_2147483647.mp4</MediaFile>
                  </MediaFiles>
               </Linear>
            </Creative>
         </Creatives>
         <Extensions>
            <Extension type="banner" action="landing" viewstart="00:00:01" viewend="00:00:05">
               <Image height="30%" width="30%" top="35%" right="0">http://mk.dawin.tv/image/dawin30/brand/20161226165087.png</Image>
               <ClickThrough>https://www.buzzvil.com/</ClickThrough>
               <ClickTracking>https://ad-prodmini.buzzvil.com/api/test/tracking?event=extentionClickTracking</ClickTracking>
            </Extension>
            <Extension type="button" action="skipwait" src="http://vplayer.dawin.tv/dawin3/img/image.png">
               <Text top="7" right="58" edgesize="1" edgecolor="#19000000" color="#e9d602" size="12" font="sans-serif" style="normal" counter="down" format="ss">5</Text>
               <Text top="7" right="9" edgesize="1" edgecolor="#19000000" color="#FFFFFF" size="12" font="sans-serif" style="normal">珥� �썑 醫낅즺</Text>
               <Background height="28" width="80" right="7" edgesize="0" edgecolor="#A5000000" color="#A5000000" radius="3" bottom="10" />
            </Extension>
            <Extension type="button" action="call">
               <Image height="55" width="55" bottom="6" left="5">http://mk.dawin.tv/file/banner/adimg/dawinbtn/201411/_call_btn.png</Image>
            </Extension>
         </Extensions>
      </InLine>
   </Ad>
</VAST>
    """.trimIndent()

    val tag4 = """
        <VAST version="3.0" xmlns:xs="http://www.w3.org/2001/XMLSchema">
            <Ad id="20001">
                <InLine>
                    <AdSystem version="4.0">iabtechlab</AdSystem>
                    <AdTitle>iabtechlab video ad</AdTitle>

                    <Pricing model="cpm" currency="USD">
                        <![CDATA[ 25.00 ]]>
                    </Pricing>

                    <Error>http://example.com/error</Error>

                    <Impression id="Impression-ID">http://example.com/track/impression</Impression>

                    <Creatives>
                        <Creative id="5480" sequence="1">
                            <Linear>
                                <Duration>00:00:16</Duration>
                                <TrackingEvents>
                                    <Tracking event="start">http://example.com/tracking/start</Tracking>
                                    <Tracking event="firstQuartile">http://example.com/tracking/firstQuartile</Tracking>
                                    <Tracking event="midpoint">http://example.com/tracking/midpoint</Tracking>
                                    <Tracking event="thirdQuartile">http://example.com/tracking/thirdQuartile</Tracking>
                                    <Tracking event="complete">http://example.com/tracking/complete</Tracking>
                                    <Tracking event="progress" offset="00:00:10">http://example.com/tracking/progress-10</Tracking>
                                </TrackingEvents>

                                 <VideoClicks>
                                    <ClickTracking id="blog">
                                        <![CDATA[https://iabtechlab.com]]>
                                    </ClickTracking>
                                    <CustomClick>http://iabtechlab.com</CustomClick>
                                </VideoClicks>

                                <MediaFiles>
                                    <MediaFile id="5241" delivery="progressive" type="video/mp4" bitrate="500" width="400" height="300" minBitrate="360" maxBitrate="1080" scalable="1" maintainAspectRatio="1" codec="0">
                                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro.mp4]]>
                                    </MediaFile>
                                </MediaFiles>


                            </Linear>
                        </Creative>
                    </Creatives>
                    <Extensions>
                        <Extension type="iab-Count">
                            <total_available>
                                <![CDATA[ 2 ]]>
                            </total_available>
                        </Extension>
                    </Extensions>
                </InLine>
            </Ad>
        </VAST>
    """.trimIndent()

    val tagVerificationSample = """
        <VAST version="4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.iab.com/VAST">
          <Ad id="20001" sequence="1" conditionalAd="false">
            <InLine>
              <AdSystem version="4.0">iabtechlab</AdSystem>
              <Error>http://example.com/error</Error>
              <Extensions>
                <Extension type="iab-Count">
                  <total_available>
                    <![CDATA[ 2 ]]>
                  </total_available>
                </Extension>
              </Extensions>
              <Impression id="Impression-ID">http://example.com/track/impression</Impression>
              <Pricing model="cpm" currency="USD">
                <![CDATA[ 25.00 ]]>
              </Pricing>
              <AdTitle>iabtechlab video ad</AdTitle>
              <AdVerifications>
                <Verification>
                  <JavaScriptResource>
                    <![CDATA[http://110.14.249.89:3000]]>
                  </JavaScriptResource>
                </Verification>
              </AdVerifications>
              <Advertiser>IAB Sample Company</Advertiser>
              <Category authority="foo" />
              <Creatives>
                <Creative id="5480" sequence="1" adId="2447226">
                  <UniversalAdId idRegistry="Ad-ID" idValue="8465">8465</UniversalAdId>
                  <Linear>
                    <TrackingEvents>
                      <Tracking event="start">http://example.com/tracking/start</Tracking>
                      <Tracking event="firstQuartile">http://example.com/tracking/firstQuartile</Tracking>
                      <Tracking event="midpoint">http://example.com/tracking/midpoint</Tracking>
                      <Tracking event="thirdQuartile">http://example.com/tracking/thirdQuartile</Tracking>
                      <Tracking event="complete">http://example.com/tracking/complete</Tracking>
                      <Tracking event="progress" offset="00:00:10">http://example.com/tracking/progress-10</Tracking>
                    </TrackingEvents>
                    <Duration>00:00:16</Duration>
                    <MediaFiles>
                      <MediaFile id="5241" delivery="progressive" type="video/mp4" bitrate="2000" width="1280" height="720" minBitrate="1500" maxBitrate="2500" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro.mp4]]>
                      </MediaFile>
                      <MediaFile id="5244" delivery="progressive" type="video/mp4" bitrate="1000" width="854" height="480" minBitrate="700" maxBitrate="1500" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro-mid-resolution.mp4]]>
                      </MediaFile>
                      <MediaFile id="5246" delivery="progressive" type="video/mp4" bitrate="600" width="640" height="360" minBitrate="500" maxBitrate="700" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro-low-resolution.mp4]]>
                      </MediaFile>
                    </MediaFiles>
                    <VideoClicks>
                      <ClickThrough id="blog">
                        <![CDATA[https://iabtechlab.com]]>
                      </ClickThrough>
                    </VideoClicks>
                  </Linear>
                </Creative>
              </Creatives>
            </InLine>
          </Ad>
        </VAST>
    """.trimIndent()

    val tagVerificationSampleOrigin = """
        <VAST version="4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.iab.com/VAST">
          <Ad id="20001" sequence="1" conditionalAd="false">
            <InLine>
              <AdSystem version="4.0">iabtechlab</AdSystem>
              <Error>http://example.com/error</Error>
              <Extensions>
                <Extension type="iab-Count">
                  <total_available>
                    <![CDATA[ 2 ]]>
                  </total_available>
                </Extension>
              </Extensions>
              <Impression id="Impression-ID">http://example.com/track/impression</Impression>
              <Pricing model="cpm" currency="USD">
                <![CDATA[ 25.00 ]]>
              </Pricing>
              <AdTitle>iabtechlab video ad</AdTitle>
              <AdVerifications>
                <Verification>
                  <JavaScriptResource>
                    <![CDATA[https://verificationcompany1.com/verification_script1.js]]>
                  </JavaScriptResource>
                </Verification>
                <Verification>
                  <JavaScriptResource>
                    <![CDATA[https://verificationcompany.com/untrusted.js]]>
                  </JavaScriptResource>
                </Verification>
              </AdVerifications>
              <Advertiser>IAB Sample Company</Advertiser>
              <Category authority="foo" />
              <Creatives>
                <Creative id="5480" sequence="1" adId="2447226">
                  <UniversalAdId idRegistry="Ad-ID" idValue="8465">8465</UniversalAdId>
                  <Linear>
                    <TrackingEvents>
                      <Tracking event="start">http://example.com/tracking/start</Tracking>
                      <Tracking event="firstQuartile">http://example.com/tracking/firstQuartile</Tracking>
                      <Tracking event="midpoint">http://example.com/tracking/midpoint</Tracking>
                      <Tracking event="thirdQuartile">http://example.com/tracking/thirdQuartile</Tracking>
                      <Tracking event="complete">http://example.com/tracking/complete</Tracking>
                      <Tracking event="progress" offset="00:00:10">http://example.com/tracking/progress-10</Tracking>
                    </TrackingEvents>
                    <Duration>00:00:16</Duration>
                    <MediaFiles>
                      <MediaFile id="5241" delivery="progressive" type="video/mp4" bitrate="2000" width="1280" height="720" minBitrate="1500" maxBitrate="2500" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro.mp4]]>
                      </MediaFile>
                      <MediaFile id="5244" delivery="progressive" type="video/mp4" bitrate="1000" width="854" height="480" minBitrate="700" maxBitrate="1500" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro-mid-resolution.mp4]]>
                      </MediaFile>
                      <MediaFile id="5246" delivery="progressive" type="video/mp4" bitrate="600" width="640" height="360" minBitrate="500" maxBitrate="700" scalable="1" maintainAspectRatio="1" codec="H.264">
                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro-low-resolution.mp4]]>
                      </MediaFile>
                    </MediaFiles>
                    <VideoClicks>
                      <ClickThrough id="blog">
                        <![CDATA[https://iabtechlab.com]]>
                      </ClickThrough>
                    </VideoClicks>
                  </Linear>
                </Creative>
              </Creatives>
            </InLine>
          </Ad>
        </VAST>
    """.trimIndent()

    val viewabilityTestTag = """
        <VAST version="4.0" xmlns="http://www.iab.com/VAST">
          <Ad id="20010" sequence="1" conditionalAd="false">
            <Wrapper followAdditionalWrappers="0" allowMultipleAds="1" fallbackOnNoAd="0">
              <AdSystem version="4.0">iabtechlab</AdSystem>
              <Error>http://example.com/error</Error>
              <Impression id="Impression-ID">http://example.com/track/impression</Impression>
              <ViewableImpression id="1543">
                <Viewable>
                  <![CDATA[http://search.iabtechlab.com/error?errcode=102&imprid=s5-ea2f7f298e28c0c98374491aec3dfeb1&ts=1243]]>
                </Viewable>
                <NotViewable>
                  <![CDATA[http://search.iabtechlab.com/error?errcode=102&imprid=s5-ea2f7f298e28c0c98374491aec3dfeb1&ts=1243]]>
                </NotViewable>
                <ViewUndetermined>
                  <![CDATA[http://search.iabtechlab.com/error?errcode=102&imprid=s5-ea2f7f298e28c0c98374491aec3dfeb1&ts=1243]]>
                </ViewUndetermined>
              </ViewableImpression>
              <Creatives>
                <Creative id="5480" sequence="1" adId="2447226">
                  <Linear>
                    <TrackingEvents>
                      <Tracking event="start">http://example.com/tracking/start</Tracking>
                      <Tracking event="progress" offset="00:00:10">http://example.com/tracking/progress-10</Tracking>
                    </TrackingEvents>
                  </Linear>
                </Creative>
              </Creatives>
              <VASTAdTagURI>
                <![CDATA[https://raw.githubusercontent.com/InteractiveAdvertisingBureau/VAST_Samples/master/VAST%204.0%20Samples/Inline_Companion_Tag-test.xml]]>
              </VASTAdTagURI>
            </Wrapper>
          </Ad>
        </VAST>
    """.trimIndent()

    val pubadsTag = """
        <VAST xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="vast.xsd" version="3.0">
            <Ad id="4858772621">
            <InLine>
                <AdSystem>GDFP</AdSystem>
                <AdTitle>OMID Google Viewability Single Linear</AdTitle>
                <Description>
                    <![CDATA[ OMID Google Viewability Single Linear ad ]]>
                </Description>
                <Error>
                    <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=videoplayfailed[ERRORCODE]]]>
                </Error>
                <Impression>
                    <![CDATA[https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjssYh0wIiCYAChCCRfK1R5pkL632OLYKfqtNA2oF4jSlMicP-2_8VkzagvxNxuOi9GdL0m6F8YdtRZRlKitxhIXlFxYvZR-ik_dqInMhdfg9YqRZ7jD15BfktyW__4XOf1IjqeDitZooIm9qPMO1hgApIpOqIOKXtV3xdP1tiWC3P5m2Ng7vNXq0nGjDxxEI6tiy5TglYeYL22JSmL0_y3hSw0Vln43J7Wqe3dEGrvSm9hEA1LYtcO92ZzPExWD_pZshHIeeDLd7spGx2aWGEF-myA&sai=AMfl-YQirUTXOci4MJ5msv-eqX1yxASXr9IEIukpxB2kRzOC6u8yivnnoSnZWOsx6HNi43WdGcIiSiaUAeuT1U3qyVOryDgAhDRjH_1-eIUYQ5FE&sig=Cg0ArKJSzEr7VnPZqjbzEAE&adurl=]]>
                </Impression>
                <Creatives>
                <Creative id="138250170655" sequence="1">
                <Linear>
                <Duration>00:00:10</Duration>
                <TrackingEvents>
                <Tracking event="start">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=part2viewed&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="firstQuartile">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=videoplaytime25&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="midpoint">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=videoplaytime50&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="thirdQuartile">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=videoplaytime75&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="complete">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=videoplaytime100&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="mute">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=admute&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="unmute">
                <![CDATA[https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adunmute&ad_mt=[AD_MT]]]>
                </Tracking>
                <Tracking event="rewind">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adrewind&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="pause">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adpause&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="resume">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adresume&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="fullscreen">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adfullscreen&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="creativeView">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=vast_creativeview&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="exitFullscreen">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=vast_exit_fullscreen&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="acceptInvitationLinear">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=acceptinvitation&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                <Tracking event="closeLinear">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=adclose&ad_mt=[AD_MT]
                ]]>
                </Tracking>
                </TrackingEvents>
                <VideoClicks>
                <ClickThrough id="GDFP">
                <![CDATA[
                http://pubads.g.doubleclick.net/pcs/click?xai=AKAOjsvMkI-6B9YIr6oV7rtlVazkeMyxUtDGG3N2efAHqZXPEnaX0Cvpva06uugiSaw2aX7-a3cEshZt5eKXynKwkWwYt0Bj5J_80_1YntYFWbo1jRN8Lk317vobSqKTz8slTcrx67plJYJCmAWhsvSLYohcTwFxWMA4Dou4AfgAS1UqcGaz3M5gB6nG2s74HMeJgsginOuTRjgeu-CZ9aHb7adsrIHL2kU2yldzyHOSAKVXRYZJGudMyjz_j9XeKvx618koMlQ9g2HVfSWcwBG4wg&sai=AMfl-YTCvOX34WCllN39iwhBPpN5x9c2LMZwTwYCIoHY4FnCD6f-zo_eTi6ZWUqmLLSGUSaSEWJE2btMSIhLKg6RZ2Dl5wWf_4eHEP0a0XBrCyUY&sig=Cg0ArKJSzABIGBHHK_bC&adurl=http://www.google.com
                ]]>
                </ClickThrough>
                </VideoClicks>
                <MediaFiles>
                <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/mp4" bitrate="240" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/15/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/070F35ED1FEF65E8716AD49B244DAD266D40B2D6.035B9DCB3A487C1AF02F2F330C7EA210F15062B3/key/ck2/file/file.mp4
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="176" height="144" type="video/3gpp" bitrate="33" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/17/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/06264AA1F11E40D93888E5D181F7F534161DBE7F.9C9C8BFDCB82031333E30EE60CD2A4FE0845FF5B/key/ck2/file/file.3gp
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="320" height="180" type="video/3gpp" bitrate="64" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/36/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/98A2091C03F93DB72342BE1C8D2A69464C19A071.13CA1828DBFC3095409BB4649837E43222A4B45F/key/ck2/file/file.3gp
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="640" height="360" type="video/mp4" bitrate="140" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/18/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/7A9A7766ACF7777FF9767A8C947838C39713E7BB.7A8BE8CA3903D4F6A7194FD4DDD7572D5D673C03/key/ck2/file/file.mp4
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="640" height="360" type="video/webm" bitrate="122" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/43/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/2411F5EB84B30A08B990A671DC2CF96343CEFBED.2670EE873097F3E97E97D9B6033F19BEBF224CC7/key/ck2/file/file.webm
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="streaming" width="854" height="480" type="application/x-mpegURL" minBitrate="24" maxBitrate="248" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/api/manifest/hls_variant/requiressl/yes/source/gfp_video_ads/id/631263964845293b/itag/0/playlist_type/LIVE/acao/yes/mime/application%2Fx-mpegURL/ctier/L/ip/0.0.0.0/ipbits/0/expire/1616830414/sparams/ip,ipbits,expire,requiressl,source,id,itag,playlist_type,acao,mime,ctier/signature/9258325E72577D5316E8FBA641E2225502E819AD.941031BE2A4285370A06F15947EFACB0D6DA71E8/key/ck2/file/index.m3u8
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/mp4" bitrate="228" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/22/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/2951108B532DD16C616D3E8AE665D8C39F280F70.386330CEF5A7A11578678A09F202943D05A368FC/key/ck2/file/file.mp4
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="streaming" width="854" height="480" type="application/dash+xml" minBitrate="24" maxBitrate="248" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/api/manifest/dash/requiressl/yes/source/gfp_video_ads/id/631263964845293b/itag/0/playlist_type/LIVE/acao/yes/mime/application%2Fdash+xml/ctier/L/ip/0.0.0.0/ipbits/0/expire/1616830414/sparams/ip,ipbits,expire,requiressl,source,id,itag,playlist_type,acao,mime,ctier/signature/6B1349B1EBB90FB573698E7034DAD56D6A3005C4.7CE714C252382FFEF599E0859D25CE221475F10E/key/ck2
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="854" height="480" type="video/webm" bitrate="140" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/44/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/9FC7644AC7C15E32617600D04F05DE75BB86898C.91305C865C651EA46EA577850156484AC2AAA56C/key/ck2/file/file.webm
                ]]>
                </MediaFile>
                <MediaFile id="GDFP" delivery="progressive" width="1280" height="720" type="video/webm" bitrate="236" scalable="true" maintainAspectRatio="true">
                <![CDATA[
                https://redirector.gvt1.com/videoplayback/id/631263964845293b/itag/45/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1585316014/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/09381AE0D7A9A05FDF95790D08C7ED0514C37E19.33D77289B81EAD250DBBBDB5A9299BF56BEEA005/key/ck2/file/file.webm
                ]]>
                </MediaFile>
                </MediaFiles>
                </Linear>
                </Creative>
                </Creatives>
                <Extensions>
                <Extension type="waterfall" fallback_index="0"/>
                <Extension type="geo">
                <Country>KR</Country>
                <Bandwidth>4</Bandwidth>
                <BandwidthKbps>20000</BandwidthKbps>
                </Extension>
                <Extension type="metrics">
                <FeEventId>Tqx9XrjQJ46F2wTpsaSwAw</FeEventId>
                <AdEventId>CMP2zPORuugCFZSGlgodqEgAnA</AdEventId>
                </Extension>
                <Extension type="ShowAdTracking">
                <CustomTracking>
                <Tracking event="show_ad">
                <![CDATA[
                https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjstV6IvuM4guqfMLYzQKwb8FQLtWXTqGb0OSmDU9ZOtZZ34nTcYdngJHWPSJIsu2R9Jss6rYQ6nUvHRvLNgbDHzVHPPgbKUzNi9J5JCrXdeUMer-l-O7BhRJ4tc5Bp42mY16RNpjovEWg76nLO--AWg-LxtfIKbU4rU44hXgwc7cO3OJkJ01ZTn4WWUmCFvSKGfyLQJfDwhpI_VonJFEgeoD4ukYiv-T6CbIRyzJLkLTgN6HK-qI7H5sGxFkoOaHtsqbQ8bizf2kYgyl8nwwXqfgx0Yg&sai=AMfl-YRIJEtzBH0PgAmQ7e-9dAO0yslGFa5KfPsNIjzq9Y3QUM0bGJUOsb6symPQAMqWIWxlLwagufhET6eC0UeO_RQZaG1bNLGwR2nF87CiTg8c&sig=Cg0ArKJSzOwxTB58yNO7EAE&adurl=
                ]]>
                </Tracking>
                </CustomTracking>
                </Extension>
                <Extension type="video_ad_loaded">
                <CustomTracking>
                <Tracking event="loaded">
                <![CDATA[
                https://pubads.g.doubleclick.net/pagead/conversion/?ai=BYvtMTqx9XsOXKJSN2gSokYHgCcyQ3a5FAAAAEAEgqN27JjgAWJ_i6IKDBGCbg-mEnCmyAQ10ZXN0X3NpdGUuY29tugELNjQweDQ4MF94bWzIAQXaARVodHRwOi8vdGVzdF9zaXRlLmNvbS_AAgLgAgDqAicvMTI0MzE5MDk2L2V4dGVybmFsL29taWRfZ29vZ2xlX3NhbXBsZXP4AoXSHoADAZAD7AmYA6wCqAMB4AQB0gUGEI3564wSoAYjiAcBkAcCqAfs1RuoB_PRG6gHwtob2AcB4AcL0ggGCAAQAhgdmAsB&sigh=hj4EK7-sTS8&label=video_ad_loaded
                ]]>
                </Tracking>
                </CustomTracking>
                </Extension>
                </Extensions>
            </InLine>
            </Ad>
        </VAST>
    """.trimIndent()

    val inlineNonlinearVerificationVast2_0 = """
        <VAST version="2.0">
            <Ad id="preroll-1">
                <InLine>
                    <AdSystem>2.0</AdSystem>
                    <AdTitle>5748406</AdTitle>
                    <Impression id="blah">
                        <![CDATA[http://b.scorecardresearch.com/b?C1=1&C2=6000003&C3=0000000200500000197000000&C4=us&C7=http://www.scanscout.com&C8=scanscout.com&C9=http://www.scanscout.com&C10=xn&rn=-103217130]]>
                    </Impression>
                    <Creatives>
                        <Creative>
                            <Linear>
                                <Duration>00:00:30</Duration>
                                <TrackingEvents></TrackingEvents>
                                <VideoClicks>
                                    <ClickThrough id="scanscout">
                                        <![CDATA[ http://www.target.com ]]>
                                    </ClickThrough>
                                </VideoClicks>
                                <MediaFiles>
                                    <MediaFile bitrate="496" delivery="progressive" height="396"
                                        type="video/mp4" width="600">
                                        <![CDATA[https://iab-publicfiles.s3.amazonaws.com/vast/VAST-4.0-Short-Intro.mp4]]>
                                    </MediaFile>
                                </MediaFiles>
                            </Linear>
                        </Creative>
                        <Creative>
                            <CompanionAds>
                                <Companion height="250" id="555750" width="300">
                                    <HTMLResource>
                                        <![CDATA[<A onClick="var i= new Image(1,1); i.src='http://app.scanscout.com/ssframework/log/log.png?a=logitemaction&RI=555750&CbC=1&CbF=true&EC=0&RC=0&SmC=2&CbM=1.0E-5&VI=736e6b13bad531dc476bc3612749bc35&admode=preroll&PRI=-4827170214961170629&RprC=0&ADsn=17&VcaI=192,197&RrC=1&VgI=736e6b13bad531dc476bc3612749bc35&AVI=142&Ust=ma&Uctry=us&CI=1223187&AC=4&PI=567&Udma=506&ADI=5748406&VclF=true';" HREF="http://target.com" target="_blank"><IMG SRC="http://media.scanscout.com/ads/target300x250Companion.jpg" BORDER=0 WIDTH=300 HEIGHT=250 ALT="Click Here"></A><img src="http://app.scanscout.com/ssframework/log/log.png?a=logitemaction&RI=555750&CbC=1&CbF=true&EC=1&RC=0&SmC=2&CbM=1.0E-5&VI=736e6b13bad531dc476bc3612749bc35&admode=preroll&PRI=-4827170214961170629&RprC=0&ADsn=17&VcaI=192,197&RrC=1&VgI=736e6b13bad531dc476bc3612749bc35&AVI=142&Ust=ma&Uctry=us&CI=1223187&AC=4&PI=567&Udma=506&ADI=5748406&VclF=true" height="1" width="1">]]>
                                    </HTMLResource>
                                </Companion>
                            </CompanionAds>
                        </Creative>
                    </Creatives>
                    <Extensions>
                        <Extension type="AdVerifications">
                            <AdVerifications>
                                <Verification vendor="iabtechlab.com-omid">
                                    <JavaScriptResource apiFramework="omid" browserOptional="true">
                                        <![CDATA[ https://s3-us-west-2.amazonaws.com/omsdk-files/compliance-js/omid-validation-verification-script-v1.js ]]>
                                    </JavaScriptResource>
                                    <TrackingEvents>
                                        <Tracking event="verificationNotExecuted">
                                            <![CDATA[https://company.com/pixel.jpg?error=[REASON]]]>
                                        </Tracking>
                                    </TrackingEvents>
                                    <VerificationParameters>
                                        <![CDATA[parameter1=value1&parameter2=value2&parameter3=value3]]>
                                    </VerificationParameters>
                                </Verification>
                            </AdVerifications>
                        </Extension>
                    </Extensions>
                </InLine>
            </Ad>
        </VAST>
        """.trimIndent()

    val yohanTag = """
        <?xml version="1.0" encoding="UTF-8"?>

        <VAST version="2.0">

            <Ad id="905f8f90bbab0eb7ba490ebbfa0882ffd2896371ff8f142940ef6c11ab0e40abe1f7a3d5a78e248eb6c470236e34486a7f076164de484853031ded6df8fb6814302b68a4db66e423923625349513d11eb09303ea3c83f16d24c9742935743c1a7a4537e2689c73a8d78b14a4c22931e7ad">

                <InLine>

                    <AdSystem>2.0</AdSystem>

                    <AdTitle>1900648</AdTitle>

                    <Impression><![CDATA[https://ad-dev.buzzvil.com/impression0]]></Impression>
                    <Impression><![CDATA[https://ad-dev.buzzvil.com/impression1]]></Impression>
                    <Impression><![CDATA[https://ad-dev.buzzvil.com/impression2]]></Impression>
                    <Impression><![CDATA[https://ad-dev.buzzvil.com/impression3]]></Impression>

                    <Creatives>

                        <Creative>

                            <Linear>

                                <Duration>00:00:21.06</Duration>

                                <TrackingEvents>

                                    <Tracking event="creativeView"><![CDATA[https://ad-dev.buzzvil.com/creativeView]]></Tracking>

                                    <Tracking event="start"><![CDATA[https://ad-dev.buzzvil.com/start]]></Tracking>

                                    <Tracking event="firstQuartile"><![CDATA[https://ad-dev.buzzvil.com/firstQuartile]]></Tracking>

                                    <Tracking event="midpoint"><![CDATA[https://ad-dev.buzzvil.com/midpoint]]></Tracking>

                                    <Tracking event="thirdQuartile"><![CDATA[https://ad-dev.buzzvil.com/thirdQuartile]]></Tracking>

                                    <Tracking event="complete"><![CDATA[https://ad-dev.buzzvil.com/complete]]></Tracking>

                                    <Tracking event="progress" offset="50%"><![CDATA[https://ad-dev.buzzvil.com/progress]]></Tracking>

                                    <Tracking event="fullscreen"><![CDATA[https://ad-dev.buzzvil.com/fullscreen]]></Tracking>

                                    <Tracking event="closeLinear"><![CDATA[https://ad-dev.buzzvil.com/closeLinear]]></Tracking>

                                </TrackingEvents>

                                <VideoClicks>

                                    <ClickThrough id="1"><![CDATA[https://ad-dev.buzzvil.com/clickThrough]]></ClickThrough>

                                </VideoClicks>

                                <MediaFiles>

                                    <MediaFile width="640" height="360" type="video/mp4" delivery="progressive"><![CDATA[https://i.amoad.com/creatives/208/f0a/940/video_mute.mp4]]></MediaFile>

                                    <MediaFile width="640" height="360" type="video/webm" delivery="progressive"><![CDATA[https://i.amoad.com/creatives/208/f0a/940/video_mute.webm]]></MediaFile>

                                </MediaFiles>

                            </Linear>

                        </Creative>

                    </Creatives>

                    <Extensions>

                        <Extension service="amoad" playType="banner" isAutoRepeat="true" repeatWait="5" soundSetting="OFF" volumeRatio="0.5" enableInlineVideoPlayer="true" autoPlay="true" inviewRatio="0.5" outviewRatio="0.9">

                            <ReplaceImage creativeType="image/jpeg" width="640" height="360"><![CDATA[https://i.amoad.com/creatives/208/f0a/940/000.jpg]]></ReplaceImage>

                            <EndCard creativeType="image/jpeg" width="640" height="360"><![CDATA[https://i.amoad.com/creatives/208/f0a/940/endcard.jpg]]></EndCard>

                            <LPURL id="lpurl"><![CDATA[]]></LPURL>

                        </Extension>

                    </Extensions>

                </InLine>

            </Ad>

        </VAST>
    """.trimIndent()
}
