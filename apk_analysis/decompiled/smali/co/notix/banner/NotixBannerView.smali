.class public final Lco/notix/banner/NotixBannerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Lco/notix/utils/ExperimentalNotixApi;
.end annotation


# instance fields
.field private final callbackExecutor:Lco/notix/mg;

.field private contentLoadJob:LY7/h0;

.field private final contentLoadedF:Lb8/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8/F;"
        }
    .end annotation
.end field

.field private final csDefault:LY7/z;

.field private final csMain:LY7/z;

.field private final isAttachedF:Lb8/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8/F;"
        }
    .end annotation
.end field

.field private final isVisibleF:Lb8/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8/F;"
        }
    .end annotation
.end field

.field private final layoutF:Lb8/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8/F;"
        }
    .end annotation
.end field

.field private listener:Lco/notix/banner/NotixBannerListener;

.field private final loadCalled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private loader:Lco/notix/banner/NotixBannerLoader;

.field private request:Lco/notix/banner/BannerRequest;

.field private responseSize:Lco/notix/banner/BannerSize;

.field private final timeVisibleF:Lb8/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb8/F;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/notix/banner/NotixBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/notix/banner/NotixBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object p1

    invoke-virtual {p1}, Lco/notix/g9;->c()LY7/z;

    move-result-object p1

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->csMain:LY7/z;

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object p1

    invoke-virtual {p1}, Lco/notix/g9;->a()LY7/z;

    move-result-object p1

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    invoke-static {}, Lco/notix/wq;->s()Lco/notix/mg;

    move-result-object p1

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->callbackExecutor:Lco/notix/mg;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p2

    iput-object p2, p0, Lco/notix/banner/NotixBannerView;->isAttachedF:Lb8/F;

    invoke-static {p1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p2

    iput-object p2, p0, Lco/notix/banner/NotixBannerView;->isVisibleF:Lb8/F;

    const/4 p2, 0x0

    invoke-static {p2}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p2

    iput-object p2, p0, Lco/notix/banner/NotixBannerView;->layoutF:Lb8/F;

    const-wide/16 p2, 0x0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p2

    iput-object p2, p0, Lco/notix/banner/NotixBannerView;->timeVisibleF:Lb8/F;

    invoke-static {p1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p1

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->contentLoadedF:Lb8/F;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->loadCalled:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/notix/banner/NotixBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getCallbackExecutor$p(Lco/notix/banner/NotixBannerView;)Lco/notix/mg;
    .locals 0

    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->callbackExecutor:Lco/notix/mg;

    return-object p0
.end method

.method public static final synthetic access$getContentLoadedF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->contentLoadedF:Lb8/F;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final synthetic access$getCsMain$p(Lco/notix/banner/NotixBannerView;)LY7/z;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->csMain:LY7/z;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final synthetic access$getLoadCalled$p(Lco/notix/banner/NotixBannerView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->loadCalled:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic access$getLoader$p(Lco/notix/banner/NotixBannerView;)Lco/notix/banner/NotixBannerLoader;
    .locals 0

    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->loader:Lco/notix/banner/NotixBannerLoader;

    return-object p0
.end method

.method public static final synthetic access$getRequest$p(Lco/notix/banner/NotixBannerView;)Lco/notix/banner/BannerRequest;
    .locals 0

    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->request:Lco/notix/banner/BannerRequest;

    return-object p0
.end method

.method public static final synthetic access$getTimeVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->timeVisibleF:Lb8/F;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final synthetic access$isAttachedF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->isAttachedF:Lb8/F;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final synthetic access$isVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lco/notix/banner/NotixBannerView;->isVisibleF:Lb8/F;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static final synthetic access$loadOnce(Lco/notix/banner/NotixBannerView;)V
    .locals 0

    invoke-direct {p0}, Lco/notix/banner/NotixBannerView;->loadOnce()V

    return-void
.end method

.method public static final synthetic access$setContent(Lco/notix/banner/NotixBannerView;Lco/notix/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/notix/banner/NotixBannerView;->setContent(Lco/notix/g;)V

    return-void
.end method

.method public static final synthetic access$setResponseSize$p(Lco/notix/banner/NotixBannerView;Lco/notix/banner/BannerSize;)V
    .locals 0

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->responseSize:Lco/notix/banner/BannerSize;

    return-void
.end method

.method private final addListeners()V
    .locals 4

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    new-instance v1, Lco/notix/yf;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lco/notix/yf;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    new-instance v1, Lco/notix/cg;

    invoke-direct {v1, p0, v2}, Lco/notix/cg;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    new-instance v1, Lco/notix/dg;

    invoke-direct {v1, p0, v2}, Lco/notix/dg;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method private final calculateStickyHeightDp(Lco/notix/banner/BannerSize$Sticky;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    div-float/2addr p1, v0

    .line 30
    float-to-double v0, p1

    .line 31
    const-wide v2, 0x3fc3333333333333L    # 0.15

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    mul-double/2addr v0, v2

    .line 37
    double-to-int p1, v0

    .line 38
    const/16 v0, 0x32

    .line 39
    .line 40
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method private final createLoader(Lco/notix/banner/BannerRequest;)Lco/notix/banner/NotixBannerLoader;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lco/notix/uf;->a:Lco/notix/tf;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getZoneId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getPlacement()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getExperiment()Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getSize()Lco/notix/banner/BannerSize;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-direct {v0, v5}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v5, v5, LA7/h;->a:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v13, v5

    .line 28
    check-cast v13, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getSize()Lco/notix/banner/BannerSize;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-direct {v0, v5}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v5, v5, LA7/h;->b:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v14, v5

    .line 41
    check-cast v14, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual/range {p1 .. p1}, Lco/notix/banner/BannerRequest;->getRefreshIntervalMillis()J

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, Lco/notix/tf;->b:Lco/notix/vf;

    .line 47
    .line 48
    new-instance v15, Lco/notix/sf;

    .line 49
    .line 50
    iget-object v1, v1, Lco/notix/vf;->b:Lco/notix/j3;

    .line 51
    .line 52
    move-object/from16 v16, v2

    .line 53
    .line 54
    new-instance v2, Lco/notix/j7;

    .line 55
    .line 56
    new-instance v5, Lco/notix/domain/RequestVars;

    .line 57
    .line 58
    const/16 v11, 0x1e

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    invoke-direct/range {v5 .. v12}, Lco/notix/domain/RequestVars;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    .line 68
    move-object v7, v13

    .line 69
    move-object v8, v14

    .line 70
    move-object/from16 v6, v16

    .line 71
    .line 72
    invoke-direct/range {v2 .. v8}, Lco/notix/j7;-><init>(JLco/notix/domain/RequestVars;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lco/notix/j3;->a(Lco/notix/o4;)Lco/notix/i3;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v15, v1}, Lco/notix/sf;-><init>(Lco/notix/i3;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v15}, Lco/notix/h3;->startLoading()V

    .line 83
    .line 84
    .line 85
    return-object v15
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method private final disposeLoader()V
    .locals 1

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->loader:Lco/notix/banner/NotixBannerLoader;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lco/notix/banner/NotixBannerLoader;->stopLoading()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lco/notix/banner/NotixBannerView;->loader:Lco/notix/banner/NotixBannerLoader;

    return-void
.end method

.method private final getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/banner/BannerSize;",
            ")",
            "LA7/h;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lco/notix/banner/BannerSize$Inline;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lco/notix/banner/BannerSize$Inline;

    .line 6
    .line 7
    invoke-virtual {p1}, Lco/notix/banner/BannerSize$Inline;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Lco/notix/banner/BannerSize$Inline;->getMaxHeight()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v1, LA7/h;

    .line 24
    .line 25
    invoke-direct {v1, v0, p1}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    instance-of v0, p1, Lco/notix/banner/BannerSize$Sticky;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    check-cast p1, Lco/notix/banner/BannerSize$Sticky;

    .line 34
    .line 35
    invoke-virtual {p1}, Lco/notix/banner/BannerSize$Sticky;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, p1}, Lco/notix/banner/NotixBannerView;->calculateStickyHeightDp(Lco/notix/banner/BannerSize$Sticky;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, LA7/h;

    .line 52
    .line 53
    invoke-direct {v1, v0, p1}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_1
    instance-of v0, p1, Lco/notix/banner/BannerSize$Fixed;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    check-cast p1, Lco/notix/banner/BannerSize$Fixed;

    .line 62
    .line 63
    invoke-virtual {p1}, Lco/notix/banner/BannerSize$Fixed;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1}, Lco/notix/banner/BannerSize$Fixed;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v1, LA7/h;

    .line 80
    .line 81
    invoke-direct {v1, v0, p1}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    new-instance p1, LA7/b;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method private final loadOnce()V
    .locals 4

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->contentLoadJob:LY7/h0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LY7/h0;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    new-instance v1, Lco/notix/jg;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lco/notix/jg;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v1, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    move-result-object v0

    iput-object v0, p0, Lco/notix/banner/NotixBannerView;->contentLoadJob:LY7/h0;

    return-void
.end method

.method private static final onMeasure$makeMs(I)I
    .locals 1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lco/notix/h9;->a(Ljava/lang/Number;)F

    move-result p0

    float-to-int p0, p0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method private final setContent(Lco/notix/g;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "context"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    new-instance v0, Lco/notix/v5;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v4, v1, v3}, Lco/notix/v5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Lco/notix/i;

    .line 25
    .line 26
    iget-object v1, p0, Lco/notix/banner/NotixBannerView;->responseSize:Lco/notix/banner/BannerSize;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-direct {p0, v1}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v1, v1, LA7/h;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v3

    .line 46
    :goto_0
    iget-object v2, p0, Lco/notix/banner/NotixBannerView;->responseSize:Lco/notix/banner/BannerSize;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-direct {p0, v2}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    iget-object v2, v2, LA7/h;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    :cond_1
    new-instance v2, Lco/notix/kg;

    .line 65
    .line 66
    invoke-direct {v2, p0}, Lco/notix/kg;-><init>(Lco/notix/banner/NotixBannerView;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1, v1, v3, v2}, Lco/notix/v5;->a(Lco/notix/i;IILco/notix/kg;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    instance-of v0, p1, Lco/notix/m;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    new-instance v0, Lco/notix/ir;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v4, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v4, v1, v3}, Lco/notix/ir;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    check-cast p1, Lco/notix/m;

    .line 93
    .line 94
    invoke-virtual {v0, p1}, Lco/notix/ir;->setContent(Lco/notix/m;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    return-void
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method


# virtual methods
.method public final getListener()Lco/notix/banner/NotixBannerListener;
    .locals 1

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->listener:Lco/notix/banner/NotixBannerListener;

    return-object v0
.end method

.method public final load(Lco/notix/banner/BannerRequest;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->loadCalled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->request:Lco/notix/banner/BannerRequest;

    invoke-direct {p0, p1}, Lco/notix/banner/NotixBannerView;->createLoader(Lco/notix/banner/BannerRequest;)Lco/notix/banner/NotixBannerLoader;

    move-result-object p1

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->loader:Lco/notix/banner/NotixBannerLoader;

    invoke-direct {p0}, Lco/notix/banner/NotixBannerView;->loadOnce()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->isAttachedF:Lb8/F;

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    check-cast v0, Lb8/Q;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2, v1}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->request:Lco/notix/banner/BannerRequest;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lco/notix/banner/NotixBannerView;->createLoader(Lco/notix/banner/BannerRequest;)Lco/notix/banner/NotixBannerLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lco/notix/banner/NotixBannerView;->loader:Lco/notix/banner/NotixBannerLoader;

    .line 26
    .line 27
    :cond_0
    invoke-direct {p0}, Lco/notix/banner/NotixBannerView;->addListeners()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->isAttachedF:Lb8/F;

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    check-cast v0, Lb8/Q;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2, v1}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csDefault:LY7/z;

    .line 18
    .line 19
    invoke-interface {v0}, LY7/z;->g()LE7/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LY7/B;->e(LE7/i;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->csMain:LY7/z;

    .line 27
    .line 28
    invoke-interface {v0}, LY7/z;->g()LE7/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, LY7/B;->e(LE7/i;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lco/notix/banner/NotixBannerView;->disposeLoader()V

    .line 36
    .line 37
    .line 38
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public onLayout(ZIIII)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object v0, p1, Lco/notix/banner/NotixBannerView;->layoutF:Lb8/F;

    .line 6
    .line 7
    new-instance v1, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v1, p2, p3, p4, p5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lb8/Q;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {v0, p2, v1}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public onMeasure(II)V
    .locals 1

    iget-object p1, p0, Lco/notix/banner/NotixBannerView;->responseSize:Lco/notix/banner/BannerSize;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, LA7/h;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->onMeasure$makeMs(I)I

    move-result p1

    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->responseSize:Lco/notix/banner/BannerSize;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lco/notix/banner/NotixBannerView;->getSimpleDp(Lco/notix/banner/BannerSize;)LA7/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p2, v0, LA7/h;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    :cond_1
    invoke-static {p2}, Lco/notix/banner/NotixBannerView;->onMeasure$makeMs(I)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onVisibilityAggregated(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onVisibilityAggregated(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/notix/banner/NotixBannerView;->isVisibleF:Lb8/F;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast v0, Lb8/Q;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, p1}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final setListener(Lco/notix/banner/NotixBannerListener;)V
    .locals 0

    iput-object p1, p0, Lco/notix/banner/NotixBannerView;->listener:Lco/notix/banner/NotixBannerListener;

    return-void
.end method
