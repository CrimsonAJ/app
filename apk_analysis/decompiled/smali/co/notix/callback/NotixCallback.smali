.class public abstract Lco/notix/callback/NotixCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/callback/NotixCallback$Subscription;,
        Lco/notix/callback/NotixCallback$Unsubscription;,
        Lco/notix/callback/NotixCallback$Impression;,
        Lco/notix/callback/NotixCallback$AdDismissed;,
        Lco/notix/callback/NotixCallback$Click;,
        Lco/notix/callback/NotixCallback$RefreshData;,
        Lco/notix/callback/NotixCallback$ManageAudience;,
        Lco/notix/callback/NotixCallback$PushDataLoad;,
        Lco/notix/callback/NotixCallback$FcmTokenReceived;,
        Lco/notix/callback/NotixCallback$GeneralMetrics;,
        Lco/notix/callback/NotixCallback$AppInstall;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lco/notix/callback/NotixCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getData()Ljava/lang/String;
.end method

.method public abstract getStatus()Lco/notix/callback/NotixCallbackStatus;
.end method
