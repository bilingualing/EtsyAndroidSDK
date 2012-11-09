package com.etsy.etsyRequests;

import com.etsy.etsyModels.Listing;

import java.util.HashMap;
import java.util.Map;

public class ListingsRequest extends EtsyRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4461679651861714014L;
	protected ListingsRequest(String requestUrl, String requestType){
		super(requestUrl, requestType);
	}

		/*
	 * Get a list of all methods available.
	 */
	public static ListingsRequest getMethodTable(){
		String methodUrl = "/";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Creates a new Listing
	 */
	public static ListingsRequest createListing(){
		String methodUrl = "/listings";
		String methodType = "POST";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Retrieves a Listing by id.
	 */
	public static ListingsRequest getListing(String listingId){
		String methodUrl = "/listings/" + listingId;
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Updates a Listing
	 */
	public static ListingsRequest updateListing(String listingId){
		String methodUrl = "/listings/" + listingId;
		String methodType = "PUT";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Deletes a Listing
	 */
	public static ListingsRequest deleteListing(String listingId){
		String methodUrl = "/listings/" + listingId;
		String methodType = "DELETE";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Retrieves a set of FavoriteListing objects associated to a Listing.
	 */
	public static ListingsRequest findAllListingFavoredBy(String listingId){
		String methodUrl = "/listings/" + listingId + "/favored-by";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Retrieves a set of ListingImage objects associated to a Listing.
	 */
	public static ListingsRequest findAllListingImages(String listingId){
		String methodUrl = "/listings/" + listingId + "/images";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Retrieves a set of ShippingInfo objects associated to a Listing.
	 */
	public static ListingsRequest findAllListingShippingInfo(String listingId){
		String methodUrl = "/listings/" + listingId + "/shipping/info";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Finds all active Listings. (Note: the sort_on and sort_order options only work when combined with one of the search options: keywords, color, tags, materials, location, etc.)
	 */
	public static ListingsRequest findAllListingActive(){
		String methodUrl = "/listings/active";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Finds all listings in a receipt
	 */
	public static ListingsRequest findAllReceiptListings(String receiptId){
		String methodUrl = "/receipts/" + receiptId + "/listings";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Get server time, in epoch seconds notation.
	 */
	public static ListingsRequest getServerEpoch(){
		String methodUrl = "/server/epoch";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Check that the server is alive.
	 */
	public static ListingsRequest ping(){
		String methodUrl = "/server/ping";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Finds all active Listings associated with a Shop
	 */
	public static ListingsRequest findAllShopListingsActive(String shopId){
	    return findAllShopListingsActive(shopId, false);
	}

    /**
     * Finds all active {@link Listing}s for a shop.
     * 
     * @param shopId unique identifier for the shop.
     * @param includeImages boolean indicator which determines whether or not
     *            the images corresponding to the shop's active listings are
     *            returned in the response.
     * @return a {@link ListingsRequest} which can be executed by an
     *         EtsyRequestManager.
     */
    public static ListingsRequest findAllShopListingsActive(String shopId, boolean includeImages) {
        // begin to build a regular active listings url ...
        StringBuilder methodUrl = new StringBuilder("/shops/");
        methodUrl.append(shopId);
        methodUrl.append("/listings/active");
        String methodType = "GET";
        ListingsRequest er = new ListingsRequest(methodUrl.toString(), methodType);
        // check to see whether the client needs images too.
        if (includeImages) {
            Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("includes", "Images");
            er.addParams(parameters);
        }
        return er;
    }
		/*
	 * Finds all listings within a shop section
	 */
	public static ListingsRequest findAllShopSectionListings(String shopId, String shopSectionId){
		String methodUrl = "/shops/" + shopId + "/sections/" + shopSectionId + "/listings";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Finds all listings within a shop section
	 */
	public static ListingsRequest findAllShopSectionListingsActive(String shopId, String shopSectionId){
		String methodUrl = "/shops/" + shopId + "/sections/" + shopSectionId + "/listings/active";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
		/*
	 * Finds all listings in a given Cart
	 */
	public static ListingsRequest findAllCartListings(String userId, String cartId){
		String methodUrl = "/users/" + userId + "/carts/" + cartId + "/listings";
		String methodType = "GET";
		ListingsRequest er = new ListingsRequest(methodUrl, methodType);

		return er;
	}
	}