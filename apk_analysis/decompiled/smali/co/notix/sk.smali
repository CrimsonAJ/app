.class public final Lco/notix/sk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:J


# instance fields
.field public final a:Lco/notix/er;

.field public final b:Lco/notix/er;

.field public final c:Lco/notix/er;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/sk;->d:J

    return-void
.end method

.method public constructor <init>(Lco/notix/di;)V
    .locals 4

    const-string v0, "objectStorageProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "pull_manager"

    invoke-static {p1, v0}, Lco/notix/ai;->a(Lco/notix/di;Ljava/lang/String;)Lco/notix/er;

    move-result-object p1

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/ok;

    const-string v2, "ad_freq"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lco/notix/ok;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/sk;->a:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/rk;

    const-string v2, "first_pull_timestamp"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/rk;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/sk;->b:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/lk;

    const-string v2, "timestamps"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/lk;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/sk;->c:Lco/notix/er;

    return-void
.end method


# virtual methods
.method public final a(ILE7/d;)Ljava/lang/Object;
    .locals 5

    .line 3
    instance-of v0, p2, Lco/notix/dk;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/dk;

    iget v1, v0, Lco/notix/dk;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/dk;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/dk;

    invoke-direct {v0, p0, p2}, Lco/notix/dk;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/dk;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/dk;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lco/notix/dk;->a:I

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/sk;->a:Lco/notix/er;

    iput p1, v0, Lco/notix/dk;->a:I

    iput v4, v0, Lco/notix/dk;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    .line 4
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 5
    iput v3, v0, Lco/notix/dk;->d:I

    invoke-virtual {p2, v2, v0}, Lco/notix/vh;->a(Ljava/lang/Number;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lco/notix/xj;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/xj;

    iget v1, v0, Lco/notix/xj;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/xj;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/xj;

    invoke-direct {v0, p0, p3}, Lco/notix/xj;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/xj;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/xj;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/xj;->b:J

    iget-object v2, v0, Lco/notix/xj;->a:Lco/notix/sk;

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/sk;->c:Lco/notix/er;

    iput-object p0, v0, Lco/notix/xj;->a:Lco/notix/sk;

    iput-wide p1, v0, Lco/notix/xj;->b:J

    iput v4, v0, Lco/notix/xj;->e:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p3, Lco/notix/vh;

    new-instance v4, Lco/notix/yj;

    invoke-direct {v4, v2, p1, p2}, Lco/notix/yj;-><init>(Lco/notix/sk;J)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/xj;->a:Lco/notix/sk;

    iput v3, v0, Lco/notix/xj;->e:I

    invoke-virtual {p3, v4, v0}, Lco/notix/vh;->a(Lco/notix/yj;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 2
    instance-of v0, p1, Lco/notix/zj;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/zj;

    iget v1, v0, Lco/notix/zj;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/zj;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/zj;

    invoke-direct {v0, p0, p1}, Lco/notix/zj;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/zj;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/zj;->d:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_2
    iget-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_3
    iget-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    iget-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    iget-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/sk;->a:Lco/notix/er;

    iput-object p0, v0, Lco/notix/zj;->a:Lco/notix/sk;

    const/4 v2, 0x1

    iput v2, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_6

    :cond_1
    move-object v2, p0

    :goto_1
    check-cast p1, Lco/notix/vh;

    iput-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    const/4 v3, 0x2

    iput v3, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_6

    :cond_2
    :goto_2
    iget-object p1, v2, Lco/notix/sk;->b:Lco/notix/er;

    iput-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    const/4 v3, 0x3

    iput v3, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_3
    check-cast p1, Lco/notix/vh;

    iput-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    const/4 v3, 0x4

    iput v3, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_6

    :cond_4
    :goto_4
    iget-object p1, v2, Lco/notix/sk;->c:Lco/notix/er;

    const/4 v2, 0x0

    iput-object v2, v0, Lco/notix/zj;->a:Lco/notix/sk;

    const/4 v2, 0x5

    iput v2, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    check-cast p1, Lco/notix/vh;

    const/4 v2, 0x6

    iput v2, v0, Lco/notix/zj;->d:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_6
    return-object v1

    :cond_6
    :goto_7
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(JLE7/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lco/notix/ck;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/ck;

    iget v1, v0, Lco/notix/ck;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ck;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ck;

    invoke-direct {v0, p0, p3}, Lco/notix/ck;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/ck;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ck;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lco/notix/ck;->b:J

    iget-object v0, v0, Lco/notix/ck;->a:Lco/notix/sk;

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/ck;->b:J

    iget-object v2, v0, Lco/notix/ck;->a:Lco/notix/sk;

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/sk;->c:Lco/notix/er;

    iput-object p0, v0, Lco/notix/ck;->a:Lco/notix/sk;

    iput-wide p1, v0, Lco/notix/ck;->b:J

    iput v4, v0, Lco/notix/ck;->e:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p3, Lco/notix/vh;

    iput-object v2, v0, Lco/notix/ck;->a:Lco/notix/sk;

    iput-wide p1, v0, Lco/notix/ck;->b:J

    iput v3, v0, Lco/notix/ck;->e:I

    invoke-virtual {p3, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    :goto_3
    check-cast p3, Ljava/util/List;

    if-eqz p3, :cond_8

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_6
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sget-wide v4, Lco/notix/sk;->d:J

    sub-long v4, p1, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 3
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    goto :goto_5

    :cond_8
    const/4 p1, 0x0

    .line 4
    :goto_5
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object p2
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/ak;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/ak;

    iget v1, v0, Lco/notix/ak;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ak;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ak;

    invoke-direct {v0, p0, p1}, Lco/notix/ak;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/ak;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ak;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/sk;->a:Lco/notix/er;

    iput v4, v0, Lco/notix/ak;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/ak;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final c(JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p3, Lco/notix/ek;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/ek;

    iget v1, v0, Lco/notix/ek;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ek;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ek;

    invoke-direct {v0, p0, p3}, Lco/notix/ek;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/ek;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ek;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/ek;->a:J

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/sk;->b:Lco/notix/er;

    iput-wide p1, v0, Lco/notix/ek;->a:J

    iput v4, v0, Lco/notix/ek;->d:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lco/notix/vh;

    .line 3
    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 4
    iput v3, v0, Lco/notix/ek;->d:I

    invoke-virtual {p3, v2, v0}, Lco/notix/vh;->a(Ljava/lang/Number;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final c(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/bk;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/bk;

    iget v1, v0, Lco/notix/bk;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/bk;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/bk;

    invoke-direct {v0, p0, p1}, Lco/notix/bk;-><init>(Lco/notix/sk;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/bk;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/bk;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/sk;->b:Lco/notix/er;

    iput v4, v0, Lco/notix/bk;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/bk;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method
