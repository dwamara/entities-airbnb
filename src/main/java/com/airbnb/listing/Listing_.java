
package com.airbnb.listing;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Listing_ {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("collection_ids")
    @Expose
    private Object collectionIds;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("has_double_blind_reviews")
    @Expose
    private Boolean hasDoubleBlindReviews;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("instant_book_enabled")
    @Expose
    private Boolean instantBookEnabled;
    @SerializedName("instant_bookable")
    @Expose
    private Boolean instantBookable;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("medium_url")
    @Expose
    private String mediumUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("native_currency")
    @Expose
    private String nativeCurrency;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
    @SerializedName("preview_encoded_png")
    @Expose
    private String previewEncodedPng;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("price_formatted")
    @Expose
    private String priceFormatted;
    @SerializedName("price_native")
    @Expose
    private Integer priceNative;
    @SerializedName("scrim_color")
    @Expose
    private String scrimColor;
    @SerializedName("smart_location")
    @Expose
    private String smartLocation;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("x_medium_picture_url")
    @Expose
    private String xMediumPictureUrl;
    @SerializedName("xl_picture_url")
    @Expose
    private String xlPictureUrl;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("bathrooms")
    @Expose
    private Double bathrooms;
    @SerializedName("bedrooms")
    @Expose
    private Integer bedrooms;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("cancellation_policy")
    @Expose
    private String cancellationPolicy;
    @SerializedName("check_in_time")
    @Expose
    private Integer checkInTime;
    @SerializedName("check_in_time_end")
    @Expose
    private String checkInTimeEnd;
    @SerializedName("check_in_time_ends_at")
    @Expose
    private Integer checkInTimeEndsAt;
    @SerializedName("check_in_time_start")
    @Expose
    private String checkInTimeStart;
    @SerializedName("check_out_time")
    @Expose
    private Integer checkOutTime;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("has_availability")
    @Expose
    private Boolean hasAvailability;
    @SerializedName("hosts")
    @Expose
    private List<Host> hosts = null;
    @SerializedName("listing_native_currency")
    @Expose
    private String listingNativeCurrency;
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("max_nights")
    @Expose
    private Integer maxNights;
    @SerializedName("min_nights")
    @Expose
    private Integer minNights;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("person_capacity")
    @Expose
    private Integer personCapacity;
    @SerializedName("picture_count")
    @Expose
    private Integer pictureCount;
    @SerializedName("picture_urls")
    @Expose
    private List<String> pictureUrls = null;
    @SerializedName("preview_encoded_pngs")
    @Expose
    private List<String> previewEncodedPngs = null;
    @SerializedName("primary_host")
    @Expose
    private PrimaryHost primaryHost;
    @SerializedName("property_type")
    @Expose
    private String propertyType;
    @SerializedName("reviews_count")
    @Expose
    private Integer reviewsCount;
    @SerializedName("room_type")
    @Expose
    private String roomType;
    @SerializedName("room_type_category")
    @Expose
    private String roomTypeCategory;
    @SerializedName("scrim_colors")
    @Expose
    private List<String> scrimColors = null;
    @SerializedName("special_offer")
    @Expose
    private Object specialOffer;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("thumbnail_urls")
    @Expose
    private List<String> thumbnailUrls = null;
    @SerializedName("xl_picture_urls")
    @Expose
    private List<String> xlPictureUrls = null;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("bed_type")
    @Expose
    private String bedType;
    @SerializedName("bed_type_category")
    @Expose
    private String bedTypeCategory;
    @SerializedName("currency_symbol_left")
    @Expose
    private String currencySymbolLeft;
    @SerializedName("force_mobile_legal_modal")
    @Expose
    private Boolean forceMobileLegalModal;
    @SerializedName("require_guest_profile_picture")
    @Expose
    private Boolean requireGuestProfilePicture;
    @SerializedName("access")
    @Expose
    private String access;
    @SerializedName("amenities")
    @Expose
    private List<String> amenities = null;
    @SerializedName("amenities_ids")
    @Expose
    private List<Integer> amenitiesIds = null;
    @SerializedName("calendar_updated_at")
    @Expose
    private String calendarUpdatedAt;
    @SerializedName("cancel_policy")
    @Expose
    private Integer cancelPolicy;
    @SerializedName("cancel_policy_short_str")
    @Expose
    private String cancelPolicyShortStr;
    @SerializedName("cleaning_fee_native")
    @Expose
    private Integer cleaningFeeNative;
    @SerializedName("currency_symbol_right")
    @Expose
    private Object currencySymbolRight;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("description_locale")
    @Expose
    private String descriptionLocale;
    @SerializedName("experiences_offered")
    @Expose
    private String experiencesOffered;
    @SerializedName("extra_user_info")
    @Expose
    private Object extraUserInfo;
    @SerializedName("extras_price_native")
    @Expose
    private Integer extrasPriceNative;
    @SerializedName("guests_included")
    @Expose
    private Integer guestsIncluded;
    @SerializedName("has_agreed_to_legal_terms")
    @Expose
    private Object hasAgreedToLegalTerms;
    @SerializedName("has_license")
    @Expose
    private Boolean hasLicense;
    @SerializedName("has_viewed_cleaning")
    @Expose
    private Object hasViewedCleaning;
    @SerializedName("has_viewed_ib_perf_dashboard_panel")
    @Expose
    private Object hasViewedIbPerfDashboardPanel;
    @SerializedName("has_viewed_terms")
    @Expose
    private Boolean hasViewedTerms;
    @SerializedName("house_rules")
    @Expose
    private String houseRules;
    @SerializedName("instant_book_welcome_message")
    @Expose
    private Object instantBookWelcomeMessage;
    @SerializedName("instant_booking_allowed_category")
    @Expose
    private String instantBookingAllowedCategory;
    @SerializedName("interaction")
    @Expose
    private String interaction;
    @SerializedName("is_location_exact")
    @Expose
    private Boolean isLocationExact;
    @SerializedName("jurisdiction_names")
    @Expose
    private List<String> jurisdictionNames = null;
    @SerializedName("jurisdiction_rollout_names")
    @Expose
    private List<String> jurisdictionRolloutNames = null;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("license")
    @Expose
    private Object license;
    @SerializedName("listing_cleaning_fee_native")
    @Expose
    private Integer listingCleaningFeeNative;
    @SerializedName("listing_monthly_price_native")
    @Expose
    private Integer listingMonthlyPriceNative;
    @SerializedName("listing_price_for_extra_person_native")
    @Expose
    private Integer listingPriceForExtraPersonNative;
    @SerializedName("listing_security_deposit_native")
    @Expose
    private Integer listingSecurityDepositNative;
    @SerializedName("listing_weekend_price_native")
    @Expose
    private Object listingWeekendPriceNative;
    @SerializedName("listing_weekly_price_native")
    @Expose
    private Integer listingWeeklyPriceNative;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("localized_check_in_time_window")
    @Expose
    private String localizedCheckInTimeWindow;
    @SerializedName("localized_check_out_time")
    @Expose
    private String localizedCheckOutTime;
    @SerializedName("localized_city")
    @Expose
    private String localizedCity;
    @SerializedName("map_image_url")
    @Expose
    private String mapImageUrl;
    @SerializedName("max_nights_input_value")
    @Expose
    private Integer maxNightsInputValue;
    @SerializedName("min_nights_input_value")
    @Expose
    private Integer minNightsInputValue;
    @SerializedName("monthly_price_factor")
    @Expose
    private Double monthlyPriceFactor;
    @SerializedName("monthly_price_native")
    @Expose
    private Integer monthlyPriceNative;
    @SerializedName("neighborhood_overview")
    @Expose
    private String neighborhoodOverview;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("picture_captions")
    @Expose
    private List<String> pictureCaptions = null;
    @SerializedName("price_for_extra_person_native")
    @Expose
    private Integer priceForExtraPersonNative;
    @SerializedName("property_type_id")
    @Expose
    private Integer propertyTypeId;
    @SerializedName("public_address")
    @Expose
    private String publicAddress;
    @SerializedName("require_guest_phone_verification")
    @Expose
    private Boolean requireGuestPhoneVerification;
    @SerializedName("requires_license")
    @Expose
    private Boolean requiresLicense;
    @SerializedName("security_deposit_formatted")
    @Expose
    private String securityDepositFormatted;
    @SerializedName("security_deposit_native")
    @Expose
    private Integer securityDepositNative;
    @SerializedName("security_price_native")
    @Expose
    private Integer securityPriceNative;
    @SerializedName("space")
    @Expose
    private String space;
    @SerializedName("square_feet")
    @Expose
    private Object squareFeet;
    @SerializedName("star_rating")
    @Expose
    private Double starRating;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("time_zone_name")
    @Expose
    private String timeZoneName;
    @SerializedName("transit")
    @Expose
    private String transit;
    @SerializedName("weekly_price_factor")
    @Expose
    private Double weeklyPriceFactor;
    @SerializedName("weekly_price_native")
    @Expose
    private Integer weeklyPriceNative;
    @SerializedName("incentives")
    @Expose
    private List<Object> incentives = null;
    @SerializedName("additional_house_rules")
    @Expose
    private String additionalHouseRules;
    @SerializedName("in_building")
    @Expose
    private Boolean inBuilding;
    @SerializedName("in_toto_area")
    @Expose
    private Boolean inTotoArea;
    @SerializedName("recent_review")
    @Expose
    private RecentReview recentReview;
    @SerializedName("toto_opt_in")
    @Expose
    private Object totoOptIn;
    @SerializedName("commercial_host_info")
    @Expose
    private Object commercialHostInfo;
    @SerializedName("review_rating_accuracy")
    @Expose
    private Integer reviewRatingAccuracy;
    @SerializedName("review_rating_checkin")
    @Expose
    private Integer reviewRatingCheckin;
    @SerializedName("review_rating_cleanliness")
    @Expose
    private Integer reviewRatingCleanliness;
    @SerializedName("review_rating_communication")
    @Expose
    private Integer reviewRatingCommunication;
    @SerializedName("review_rating_location")
    @Expose
    private Integer reviewRatingLocation;
    @SerializedName("review_rating_value")
    @Expose
    private Integer reviewRatingValue;
    @SerializedName("is_business_travel_ready")
    @Expose
    private Boolean isBusinessTravelReady;
    @SerializedName("wireless_info")
    @Expose
    private Object wirelessInfo;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getCollectionIds() {
        return collectionIds;
    }

    public void setCollectionIds(Object collectionIds) {
        this.collectionIds = collectionIds;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getHasDoubleBlindReviews() {
        return hasDoubleBlindReviews;
    }

    public void setHasDoubleBlindReviews(Boolean hasDoubleBlindReviews) {
        this.hasDoubleBlindReviews = hasDoubleBlindReviews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInstantBookEnabled() {
        return instantBookEnabled;
    }

    public void setInstantBookEnabled(Boolean instantBookEnabled) {
        this.instantBookEnabled = instantBookEnabled;
    }

    public Boolean getInstantBookable() {
        return instantBookable;
    }

    public void setInstantBookable(Boolean instantBookable) {
        this.instantBookable = instantBookable;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeCurrency() {
        return nativeCurrency;
    }

    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPreviewEncodedPng() {
        return previewEncodedPng;
    }

    public void setPreviewEncodedPng(String previewEncodedPng) {
        this.previewEncodedPng = previewEncodedPng;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPriceFormatted() {
        return priceFormatted;
    }

    public void setPriceFormatted(String priceFormatted) {
        this.priceFormatted = priceFormatted;
    }

    public Integer getPriceNative() {
        return priceNative;
    }

    public void setPriceNative(Integer priceNative) {
        this.priceNative = priceNative;
    }

    public String getScrimColor() {
        return scrimColor;
    }

    public void setScrimColor(String scrimColor) {
        this.scrimColor = scrimColor;
    }

    public String getSmartLocation() {
        return smartLocation;
    }

    public void setSmartLocation(String smartLocation) {
        this.smartLocation = smartLocation;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getXMediumPictureUrl() {
        return xMediumPictureUrl;
    }

    public void setXMediumPictureUrl(String xMediumPictureUrl) {
        this.xMediumPictureUrl = xMediumPictureUrl;
    }

    public String getXlPictureUrl() {
        return xlPictureUrl;
    }

    public void setXlPictureUrl(String xlPictureUrl) {
        this.xlPictureUrl = xlPictureUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public Integer getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Integer checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckInTimeEnd() {
        return checkInTimeEnd;
    }

    public void setCheckInTimeEnd(String checkInTimeEnd) {
        this.checkInTimeEnd = checkInTimeEnd;
    }

    public Integer getCheckInTimeEndsAt() {
        return checkInTimeEndsAt;
    }

    public void setCheckInTimeEndsAt(Integer checkInTimeEndsAt) {
        this.checkInTimeEndsAt = checkInTimeEndsAt;
    }

    public String getCheckInTimeStart() {
        return checkInTimeStart;
    }

    public void setCheckInTimeStart(String checkInTimeStart) {
        this.checkInTimeStart = checkInTimeStart;
    }

    public Integer getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Integer checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getHasAvailability() {
        return hasAvailability;
    }

    public void setHasAvailability(Boolean hasAvailability) {
        this.hasAvailability = hasAvailability;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public String getListingNativeCurrency() {
        return listingNativeCurrency;
    }

    public void setListingNativeCurrency(String listingNativeCurrency) {
        this.listingNativeCurrency = listingNativeCurrency;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Integer getMaxNights() {
        return maxNights;
    }

    public void setMaxNights(Integer maxNights) {
        this.maxNights = maxNights;
    }

    public Integer getMinNights() {
        return minNights;
    }

    public void setMinNights(Integer minNights) {
        this.minNights = minNights;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getPersonCapacity() {
        return personCapacity;
    }

    public void setPersonCapacity(Integer personCapacity) {
        this.personCapacity = personCapacity;
    }

    public Integer getPictureCount() {
        return pictureCount;
    }

    public void setPictureCount(Integer pictureCount) {
        this.pictureCount = pictureCount;
    }

    public List<String> getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(List<String> pictureUrls) {
        this.pictureUrls = pictureUrls;
    }

    public List<String> getPreviewEncodedPngs() {
        return previewEncodedPngs;
    }

    public void setPreviewEncodedPngs(List<String> previewEncodedPngs) {
        this.previewEncodedPngs = previewEncodedPngs;
    }

    public PrimaryHost getPrimaryHost() {
        return primaryHost;
    }

    public void setPrimaryHost(PrimaryHost primaryHost) {
        this.primaryHost = primaryHost;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomTypeCategory() {
        return roomTypeCategory;
    }

    public void setRoomTypeCategory(String roomTypeCategory) {
        this.roomTypeCategory = roomTypeCategory;
    }

    public List<String> getScrimColors() {
        return scrimColors;
    }

    public void setScrimColors(List<String> scrimColors) {
        this.scrimColors = scrimColors;
    }

    public Object getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(Object specialOffer) {
        this.specialOffer = specialOffer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getThumbnailUrls() {
        return thumbnailUrls;
    }

    public void setThumbnailUrls(List<String> thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
    }

    public List<String> getXlPictureUrls() {
        return xlPictureUrls;
    }

    public void setXlPictureUrls(List<String> xlPictureUrls) {
        this.xlPictureUrls = xlPictureUrls;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBedTypeCategory() {
        return bedTypeCategory;
    }

    public void setBedTypeCategory(String bedTypeCategory) {
        this.bedTypeCategory = bedTypeCategory;
    }

    public String getCurrencySymbolLeft() {
        return currencySymbolLeft;
    }

    public void setCurrencySymbolLeft(String currencySymbolLeft) {
        this.currencySymbolLeft = currencySymbolLeft;
    }

    public Boolean getForceMobileLegalModal() {
        return forceMobileLegalModal;
    }

    public void setForceMobileLegalModal(Boolean forceMobileLegalModal) {
        this.forceMobileLegalModal = forceMobileLegalModal;
    }

    public Boolean getRequireGuestProfilePicture() {
        return requireGuestProfilePicture;
    }

    public void setRequireGuestProfilePicture(Boolean requireGuestProfilePicture) {
        this.requireGuestProfilePicture = requireGuestProfilePicture;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public List<Integer> getAmenitiesIds() {
        return amenitiesIds;
    }

    public void setAmenitiesIds(List<Integer> amenitiesIds) {
        this.amenitiesIds = amenitiesIds;
    }

    public String getCalendarUpdatedAt() {
        return calendarUpdatedAt;
    }

    public void setCalendarUpdatedAt(String calendarUpdatedAt) {
        this.calendarUpdatedAt = calendarUpdatedAt;
    }

    public Integer getCancelPolicy() {
        return cancelPolicy;
    }

    public void setCancelPolicy(Integer cancelPolicy) {
        this.cancelPolicy = cancelPolicy;
    }

    public String getCancelPolicyShortStr() {
        return cancelPolicyShortStr;
    }

    public void setCancelPolicyShortStr(String cancelPolicyShortStr) {
        this.cancelPolicyShortStr = cancelPolicyShortStr;
    }

    public Integer getCleaningFeeNative() {
        return cleaningFeeNative;
    }

    public void setCleaningFeeNative(Integer cleaningFeeNative) {
        this.cleaningFeeNative = cleaningFeeNative;
    }

    public Object getCurrencySymbolRight() {
        return currencySymbolRight;
    }

    public void setCurrencySymbolRight(Object currencySymbolRight) {
        this.currencySymbolRight = currencySymbolRight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLocale() {
        return descriptionLocale;
    }

    public void setDescriptionLocale(String descriptionLocale) {
        this.descriptionLocale = descriptionLocale;
    }

    public String getExperiencesOffered() {
        return experiencesOffered;
    }

    public void setExperiencesOffered(String experiencesOffered) {
        this.experiencesOffered = experiencesOffered;
    }

    public Object getExtraUserInfo() {
        return extraUserInfo;
    }

    public void setExtraUserInfo(Object extraUserInfo) {
        this.extraUserInfo = extraUserInfo;
    }

    public Integer getExtrasPriceNative() {
        return extrasPriceNative;
    }

    public void setExtrasPriceNative(Integer extrasPriceNative) {
        this.extrasPriceNative = extrasPriceNative;
    }

    public Integer getGuestsIncluded() {
        return guestsIncluded;
    }

    public void setGuestsIncluded(Integer guestsIncluded) {
        this.guestsIncluded = guestsIncluded;
    }

    public Object getHasAgreedToLegalTerms() {
        return hasAgreedToLegalTerms;
    }

    public void setHasAgreedToLegalTerms(Object hasAgreedToLegalTerms) {
        this.hasAgreedToLegalTerms = hasAgreedToLegalTerms;
    }

    public Boolean getHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(Boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public Object getHasViewedCleaning() {
        return hasViewedCleaning;
    }

    public void setHasViewedCleaning(Object hasViewedCleaning) {
        this.hasViewedCleaning = hasViewedCleaning;
    }

    public Object getHasViewedIbPerfDashboardPanel() {
        return hasViewedIbPerfDashboardPanel;
    }

    public void setHasViewedIbPerfDashboardPanel(Object hasViewedIbPerfDashboardPanel) {
        this.hasViewedIbPerfDashboardPanel = hasViewedIbPerfDashboardPanel;
    }

    public Boolean getHasViewedTerms() {
        return hasViewedTerms;
    }

    public void setHasViewedTerms(Boolean hasViewedTerms) {
        this.hasViewedTerms = hasViewedTerms;
    }

    public String getHouseRules() {
        return houseRules;
    }

    public void setHouseRules(String houseRules) {
        this.houseRules = houseRules;
    }

    public Object getInstantBookWelcomeMessage() {
        return instantBookWelcomeMessage;
    }

    public void setInstantBookWelcomeMessage(Object instantBookWelcomeMessage) {
        this.instantBookWelcomeMessage = instantBookWelcomeMessage;
    }

    public String getInstantBookingAllowedCategory() {
        return instantBookingAllowedCategory;
    }

    public void setInstantBookingAllowedCategory(String instantBookingAllowedCategory) {
        this.instantBookingAllowedCategory = instantBookingAllowedCategory;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public Boolean getIsLocationExact() {
        return isLocationExact;
    }

    public void setIsLocationExact(Boolean isLocationExact) {
        this.isLocationExact = isLocationExact;
    }

    public List<String> getJurisdictionNames() {
        return jurisdictionNames;
    }

    public void setJurisdictionNames(List<String> jurisdictionNames) {
        this.jurisdictionNames = jurisdictionNames;
    }

    public List<String> getJurisdictionRolloutNames() {
        return jurisdictionRolloutNames;
    }

    public void setJurisdictionRolloutNames(List<String> jurisdictionRolloutNames) {
        this.jurisdictionRolloutNames = jurisdictionRolloutNames;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public Integer getListingCleaningFeeNative() {
        return listingCleaningFeeNative;
    }

    public void setListingCleaningFeeNative(Integer listingCleaningFeeNative) {
        this.listingCleaningFeeNative = listingCleaningFeeNative;
    }

    public Integer getListingMonthlyPriceNative() {
        return listingMonthlyPriceNative;
    }

    public void setListingMonthlyPriceNative(Integer listingMonthlyPriceNative) {
        this.listingMonthlyPriceNative = listingMonthlyPriceNative;
    }

    public Integer getListingPriceForExtraPersonNative() {
        return listingPriceForExtraPersonNative;
    }

    public void setListingPriceForExtraPersonNative(Integer listingPriceForExtraPersonNative) {
        this.listingPriceForExtraPersonNative = listingPriceForExtraPersonNative;
    }

    public Integer getListingSecurityDepositNative() {
        return listingSecurityDepositNative;
    }

    public void setListingSecurityDepositNative(Integer listingSecurityDepositNative) {
        this.listingSecurityDepositNative = listingSecurityDepositNative;
    }

    public Object getListingWeekendPriceNative() {
        return listingWeekendPriceNative;
    }

    public void setListingWeekendPriceNative(Object listingWeekendPriceNative) {
        this.listingWeekendPriceNative = listingWeekendPriceNative;
    }

    public Integer getListingWeeklyPriceNative() {
        return listingWeeklyPriceNative;
    }

    public void setListingWeeklyPriceNative(Integer listingWeeklyPriceNative) {
        this.listingWeeklyPriceNative = listingWeeklyPriceNative;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLocalizedCheckInTimeWindow() {
        return localizedCheckInTimeWindow;
    }

    public void setLocalizedCheckInTimeWindow(String localizedCheckInTimeWindow) {
        this.localizedCheckInTimeWindow = localizedCheckInTimeWindow;
    }

    public String getLocalizedCheckOutTime() {
        return localizedCheckOutTime;
    }

    public void setLocalizedCheckOutTime(String localizedCheckOutTime) {
        this.localizedCheckOutTime = localizedCheckOutTime;
    }

    public String getLocalizedCity() {
        return localizedCity;
    }

    public void setLocalizedCity(String localizedCity) {
        this.localizedCity = localizedCity;
    }

    public String getMapImageUrl() {
        return mapImageUrl;
    }

    public void setMapImageUrl(String mapImageUrl) {
        this.mapImageUrl = mapImageUrl;
    }

    public Integer getMaxNightsInputValue() {
        return maxNightsInputValue;
    }

    public void setMaxNightsInputValue(Integer maxNightsInputValue) {
        this.maxNightsInputValue = maxNightsInputValue;
    }

    public Integer getMinNightsInputValue() {
        return minNightsInputValue;
    }

    public void setMinNightsInputValue(Integer minNightsInputValue) {
        this.minNightsInputValue = minNightsInputValue;
    }

    public Double getMonthlyPriceFactor() {
        return monthlyPriceFactor;
    }

    public void setMonthlyPriceFactor(Double monthlyPriceFactor) {
        this.monthlyPriceFactor = monthlyPriceFactor;
    }

    public Integer getMonthlyPriceNative() {
        return monthlyPriceNative;
    }

    public void setMonthlyPriceNative(Integer monthlyPriceNative) {
        this.monthlyPriceNative = monthlyPriceNative;
    }

    public String getNeighborhoodOverview() {
        return neighborhoodOverview;
    }

    public void setNeighborhoodOverview(String neighborhoodOverview) {
        this.neighborhoodOverview = neighborhoodOverview;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<String> getPictureCaptions() {
        return pictureCaptions;
    }

    public void setPictureCaptions(List<String> pictureCaptions) {
        this.pictureCaptions = pictureCaptions;
    }

    public Integer getPriceForExtraPersonNative() {
        return priceForExtraPersonNative;
    }

    public void setPriceForExtraPersonNative(Integer priceForExtraPersonNative) {
        this.priceForExtraPersonNative = priceForExtraPersonNative;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    public Boolean getRequireGuestPhoneVerification() {
        return requireGuestPhoneVerification;
    }

    public void setRequireGuestPhoneVerification(Boolean requireGuestPhoneVerification) {
        this.requireGuestPhoneVerification = requireGuestPhoneVerification;
    }

    public Boolean getRequiresLicense() {
        return requiresLicense;
    }

    public void setRequiresLicense(Boolean requiresLicense) {
        this.requiresLicense = requiresLicense;
    }

    public String getSecurityDepositFormatted() {
        return securityDepositFormatted;
    }

    public void setSecurityDepositFormatted(String securityDepositFormatted) {
        this.securityDepositFormatted = securityDepositFormatted;
    }

    public Integer getSecurityDepositNative() {
        return securityDepositNative;
    }

    public void setSecurityDepositNative(Integer securityDepositNative) {
        this.securityDepositNative = securityDepositNative;
    }

    public Integer getSecurityPriceNative() {
        return securityPriceNative;
    }

    public void setSecurityPriceNative(Integer securityPriceNative) {
        this.securityPriceNative = securityPriceNative;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public Object getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Object squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public Double getWeeklyPriceFactor() {
        return weeklyPriceFactor;
    }

    public void setWeeklyPriceFactor(Double weeklyPriceFactor) {
        this.weeklyPriceFactor = weeklyPriceFactor;
    }

    public Integer getWeeklyPriceNative() {
        return weeklyPriceNative;
    }

    public void setWeeklyPriceNative(Integer weeklyPriceNative) {
        this.weeklyPriceNative = weeklyPriceNative;
    }

    public List<Object> getIncentives() {
        return incentives;
    }

    public void setIncentives(List<Object> incentives) {
        this.incentives = incentives;
    }

    public String getAdditionalHouseRules() {
        return additionalHouseRules;
    }

    public void setAdditionalHouseRules(String additionalHouseRules) {
        this.additionalHouseRules = additionalHouseRules;
    }

    public Boolean getInBuilding() {
        return inBuilding;
    }

    public void setInBuilding(Boolean inBuilding) {
        this.inBuilding = inBuilding;
    }

    public Boolean getInTotoArea() {
        return inTotoArea;
    }

    public void setInTotoArea(Boolean inTotoArea) {
        this.inTotoArea = inTotoArea;
    }

    public RecentReview getRecentReview() {
        return recentReview;
    }

    public void setRecentReview(RecentReview recentReview) {
        this.recentReview = recentReview;
    }

    public Object getTotoOptIn() {
        return totoOptIn;
    }

    public void setTotoOptIn(Object totoOptIn) {
        this.totoOptIn = totoOptIn;
    }

    public Object getCommercialHostInfo() {
        return commercialHostInfo;
    }

    public void setCommercialHostInfo(Object commercialHostInfo) {
        this.commercialHostInfo = commercialHostInfo;
    }

    public Integer getReviewRatingAccuracy() {
        return reviewRatingAccuracy;
    }

    public void setReviewRatingAccuracy(Integer reviewRatingAccuracy) {
        this.reviewRatingAccuracy = reviewRatingAccuracy;
    }

    public Integer getReviewRatingCheckin() {
        return reviewRatingCheckin;
    }

    public void setReviewRatingCheckin(Integer reviewRatingCheckin) {
        this.reviewRatingCheckin = reviewRatingCheckin;
    }

    public Integer getReviewRatingCleanliness() {
        return reviewRatingCleanliness;
    }

    public void setReviewRatingCleanliness(Integer reviewRatingCleanliness) {
        this.reviewRatingCleanliness = reviewRatingCleanliness;
    }

    public Integer getReviewRatingCommunication() {
        return reviewRatingCommunication;
    }

    public void setReviewRatingCommunication(Integer reviewRatingCommunication) {
        this.reviewRatingCommunication = reviewRatingCommunication;
    }

    public Integer getReviewRatingLocation() {
        return reviewRatingLocation;
    }

    public void setReviewRatingLocation(Integer reviewRatingLocation) {
        this.reviewRatingLocation = reviewRatingLocation;
    }

    public Integer getReviewRatingValue() {
        return reviewRatingValue;
    }

    public void setReviewRatingValue(Integer reviewRatingValue) {
        this.reviewRatingValue = reviewRatingValue;
    }

    public Boolean getIsBusinessTravelReady() {
        return isBusinessTravelReady;
    }

    public void setIsBusinessTravelReady(Boolean isBusinessTravelReady) {
        this.isBusinessTravelReady = isBusinessTravelReady; }

    public Object getWirelessInfo() {
        return wirelessInfo;
    }
    public void setWirelessInfo(Object wirelessInfo) {
        this.wirelessInfo = wirelessInfo;
    }
}