.class public final Lco/notix/gh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/dh;


# instance fields
.field public final a:Lco/notix/ib;

.field public final b:Lco/notix/xq;

.field public final c:Lco/notix/y8;

.field public final d:Lco/notix/co;

.field public final e:LO7/l;

.field public final f:LO7/l;


# direct methods
.method public constructor <init>(Lco/notix/ib;Lco/notix/xq;Lco/notix/d9;Lco/notix/co;Lco/notix/uq;Lco/notix/vq;)V
    .locals 1

    const-string v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestBodyInstanceInfoFiller"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDomains"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCachedDomains"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/gh;->a:Lco/notix/ib;

    iput-object p2, p0, Lco/notix/gh;->b:Lco/notix/xq;

    iput-object p3, p0, Lco/notix/gh;->c:Lco/notix/y8;

    iput-object p4, p0, Lco/notix/gh;->d:Lco/notix/co;

    iput-object p5, p0, Lco/notix/gh;->e:LO7/l;

    iput-object p6, p0, Lco/notix/gh;->f:LO7/l;

    return-void
.end method

.method public static final a(Lco/notix/gh;Ljava/lang/String;Ljava/util/Map;Lco/notix/kb;Ljava/util/Set;LO7/l;LE7/d;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    instance-of v0, p6, Lco/notix/fh;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lco/notix/fh;

    iget v1, v0, Lco/notix/fh;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/fh;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/fh;

    invoke-direct {v0, p0, p6}, Lco/notix/fh;-><init>(Lco/notix/gh;LE7/d;)V

    :goto_0
    iget-object p6, v0, Lco/notix/fh;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/fh;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p5, v0, Lco/notix/fh;->b:LO7/l;

    iget-object p4, v0, Lco/notix/fh;->a:Ljava/util/Set;

    :try_start_0
    invoke-static {p6}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p6}, La/a;->A(Ljava/lang/Object;)V

    :try_start_1
    iget-object p0, p0, Lco/notix/gh;->a:Lco/notix/ib;

    iput-object p4, v0, Lco/notix/fh;->a:Ljava/util/Set;

    iput-object p5, v0, Lco/notix/fh;->b:LO7/l;

    iput v3, v0, Lco/notix/fh;->e:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object p0, LY7/K;->b:Lf8/d;

    .line 3
    new-instance p6, Lco/notix/hb;

    const/4 v2, 0x0

    invoke-direct {p6, p1, p2, p3, v2}, Lco/notix/hb;-><init>(Ljava/lang/String;Ljava/util/Map;Lco/notix/kb;LE7/d;)V

    invoke-static {p0, p6, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v1, :cond_3

    return-object v1

    .line 4
    :cond_3
    :goto_1
    check-cast p6, Lco/notix/lb;

    sget-object p0, Lco/notix/io;->b:Lco/notix/io;

    invoke-interface {p4, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 5
    iget p0, p6, Lco/notix/lb;->a:I

    const/16 p1, 0xc8

    if-gt p1, p0, :cond_4

    const/16 p1, 0x12c

    if-ge p0, p1, :cond_4

    goto :goto_2

    .line 6
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "bad status code"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 7
    :cond_5
    :goto_2
    iget-object p0, p6, Lco/notix/lb;->b:Ljava/lang/String;

    .line 8
    invoke-interface {p5, p0}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;ZLco/notix/do;LO7/l;Lco/notix/no;Ljava/util/Set;LE7/d;)Ljava/lang/Object;
    .locals 11

    .line 9
    sget-object v0, LY7/K;->b:Lf8/d;

    .line 10
    new-instance v1, Lco/notix/eh;

    const/4 v10, 0x0

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    move-object v2, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v7, p7

    invoke-direct/range {v1 .. v10}, Lco/notix/eh;-><init>(Lco/notix/eo;Lco/notix/gh;ILjava/lang/String;ZLjava/util/Set;LO7/l;Lco/notix/no;LE7/d;)V

    move-object/from16 p1, p8

    invoke-static {v0, v1, p1}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
