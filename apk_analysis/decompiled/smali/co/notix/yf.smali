.class public final Lco/notix/yf;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lco/notix/banner/NotixBannerView;


# direct methods
.method public constructor <init>(Lco/notix/banner/NotixBannerView;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, Lco/notix/yf;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lco/notix/yf;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lco/notix/yf;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/yf;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/yf;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/yf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, LF7/a;->a:LF7/a;

    .line 3
    .line 4
    iget v2, p0, Lco/notix/yf;->a:I

    .line 5
    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    if-ne v2, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lco/notix/yf;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LY7/z;

    .line 28
    .line 29
    iget-object v2, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 30
    .line 31
    invoke-static {v2}, Lco/notix/banner/NotixBannerView;->access$isAttachedF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 36
    .line 37
    invoke-static {v3}, Lco/notix/banner/NotixBannerView;->access$isVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 42
    .line 43
    invoke-static {v4}, Lco/notix/banner/NotixBannerView;->access$getContentLoadedF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Lco/notix/wf;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct {v5, v6}, Lco/notix/wf;-><init>(LE7/d;)V

    .line 51
    .line 52
    .line 53
    const/4 v7, 0x3

    .line 54
    new-array v7, v7, [Lb8/e;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    aput-object v2, v7, v8

    .line 58
    .line 59
    aput-object v3, v7, v0

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    aput-object v4, v7, v2

    .line 63
    .line 64
    new-instance v2, Lb8/m;

    .line 65
    .line 66
    invoke-direct {v2, v7, v5}, Lb8/m;-><init>([Lb8/e;LO7/r;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lco/notix/xf;

    .line 70
    .line 71
    iget-object v4, p0, Lco/notix/yf;->c:Lco/notix/banner/NotixBannerView;

    .line 72
    .line 73
    invoke-direct {v3, p1, v4, v6}, Lco/notix/xf;-><init>(LY7/z;Lco/notix/banner/NotixBannerView;LE7/d;)V

    .line 74
    .line 75
    .line 76
    iput v0, p0, Lco/notix/yf;->a:I

    .line 77
    .line 78
    invoke-static {v2, v3, p0}, Lb8/M;->i(Lb8/e;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v1, :cond_2

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    :goto_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 86
    .line 87
    return-object p1
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
