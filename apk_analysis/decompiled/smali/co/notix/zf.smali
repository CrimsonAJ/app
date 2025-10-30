.class public final Lco/notix/zf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/f;


# instance fields
.field public final synthetic a:Lco/notix/banner/NotixBannerView;


# direct methods
.method public constructor <init>(Lco/notix/banner/NotixBannerView;)V
    .locals 0

    iput-object p1, p0, Lco/notix/zf;->a:Lco/notix/banner/NotixBannerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lco/notix/zf;->a:Lco/notix/banner/NotixBannerView;

    .line 7
    .line 8
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$getTimeVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/Long;

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    invoke-direct {p2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Lb8/Q;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, v0, p2}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lco/notix/zf;->a:Lco/notix/banner/NotixBannerView;

    .line 29
    .line 30
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$loadOnce(Lco/notix/banner/NotixBannerView;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, LA7/n;->a:LA7/n;

    .line 34
    .line 35
    return-object p1
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method
