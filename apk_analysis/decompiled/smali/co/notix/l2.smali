.class public final Lco/notix/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:J


# instance fields
.field public final a:Lco/notix/er;

.field public final b:Lco/notix/er;

.field public final c:Lco/notix/er;

.field public final d:Lco/notix/er;

.field public final e:Lco/notix/er;

.field public final f:Lco/notix/er;

.field public final g:Lco/notix/er;

.field public final h:Lco/notix/er;

.field public final i:Lco/notix/er;

.field public final j:Lco/notix/er;

.field public final k:Lco/notix/er;

.field public final l:Lco/notix/er;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/l2;->m:J

    return-void
.end method

.method public constructor <init>(Lco/notix/di;)V
    .locals 4

    const-string v0, "objectStorageProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ad_counter"

    invoke-static {p1, v0}, Lco/notix/ai;->a(Lco/notix/di;Ljava/lang/String;)Lco/notix/er;

    move-result-object p1

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/p1;

    const-string v2, "pnt"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lco/notix/p1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->a:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/d0;

    const-string v2, "pnd"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/d0;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->b:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/s1;

    const-string v2, "lnt"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/s1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->c:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/k0;

    const-string v2, "lnd"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/k0;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->d:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/v1;

    const-string v2, "rnt"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/v1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->e:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/r0;

    const-string v2, "rnd"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/r0;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->f:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/y1;

    const-string v2, "rst"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/y1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->g:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/y0;

    const-string v2, "rsd"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/y0;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->h:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/b2;

    const-string v2, "int"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/b2;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->i:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/f1;

    const-string v2, "ind"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/f1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->j:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/e2;

    const-string v2, "ist"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/e2;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->k:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/m1;

    const-string v2, "isd"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/m1;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/l2;->l:Lco/notix/er;

    return-void
.end method

.method public static final a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;
    .locals 7

    .line 5
    instance-of v0, p4, Lco/notix/w;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lco/notix/w;

    iget v1, v0, Lco/notix/w;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/w;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/w;

    invoke-direct {v0, p4}, Lco/notix/w;-><init>(LE7/d;)V

    :goto_0
    iget-object p4, v0, Lco/notix/w;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/w;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p0, v0, Lco/notix/w;->b:J

    iget-object p2, v0, Lco/notix/w;->a:Lco/notix/l2;

    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p2, v0, Lco/notix/w;->b:J

    iget-object p1, v0, Lco/notix/w;->a:Lco/notix/l2;

    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    iput-object p1, v0, Lco/notix/w;->a:Lco/notix/l2;

    iput-wide p2, v0, Lco/notix/w;->b:J

    iput v4, v0, Lco/notix/w;->d:I

    invoke-virtual {p0, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p4, Lco/notix/vh;

    iput-object p1, v0, Lco/notix/w;->a:Lco/notix/l2;

    iput-wide p2, v0, Lco/notix/w;->b:J

    iput v3, v0, Lco/notix/w;->d:I

    invoke-virtual {p4, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-wide v5, p2

    move-object p2, p1

    move-wide p0, v5

    :goto_3
    check-cast p4, Ljava/util/List;

    if-eqz p4, :cond_6

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p4, p0, p1}, Lco/notix/l2;->a(Ljava/util/List;J)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    goto :goto_4

    :cond_6
    const/4 p0, 0x0

    .line 6
    :goto_4
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    return-object p1
.end method

.method public static a(Ljava/util/List;J)Ljava/util/ArrayList;
    .locals 6

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sget-wide v4, Lco/notix/l2;->m:J

    sub-long v4, p1, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final c(Lco/notix/er;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/v;

    iget v1, v0, Lco/notix/v;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/v;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/v;

    invoke-direct {v0, p1}, Lco/notix/v;-><init>(LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/v;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/v;->b:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iput v4, v0, Lco/notix/v;->b:I

    invoke-virtual {p0, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/v;->b:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_4

    :cond_6
    const/4 p0, 0x0

    .line 2
    :goto_4
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    return-object p1
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4
    instance-of v2, v1, Lco/notix/u;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lco/notix/u;

    iget v3, v2, Lco/notix/u;->p:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lco/notix/u;->p:I

    goto :goto_0

    :cond_0
    new-instance v2, Lco/notix/u;

    invoke-direct {v2, v0, v1}, Lco/notix/u;-><init>(Lco/notix/l2;LE7/d;)V

    :goto_0
    iget-object v1, v2, Lco/notix/u;->n:Ljava/lang/Object;

    sget-object v3, LF7/a;->a:LF7/a;

    iget v4, v2, Lco/notix/u;->p:I

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v3, v2, Lco/notix/u;->m:I

    iget v4, v2, Lco/notix/u;->l:I

    iget v5, v2, Lco/notix/u;->k:I

    iget v6, v2, Lco/notix/u;->j:I

    iget v7, v2, Lco/notix/u;->i:I

    iget v8, v2, Lco/notix/u;->h:I

    iget v9, v2, Lco/notix/u;->g:I

    iget v10, v2, Lco/notix/u;->f:I

    iget v11, v2, Lco/notix/u;->e:I

    iget v12, v2, Lco/notix/u;->d:I

    iget v2, v2, Lco/notix/u;->c:I

    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    move v13, v12

    move v12, v4

    move v4, v13

    move v13, v11

    move v11, v5

    move v5, v13

    move v13, v10

    move v10, v6

    move v6, v13

    move v13, v9

    move v9, v7

    move v7, v13

    move v13, v3

    move v3, v2

    goto/16 :goto_e

    :pswitch_1
    iget v4, v2, Lco/notix/u;->l:I

    iget v5, v2, Lco/notix/u;->k:I

    iget v6, v2, Lco/notix/u;->j:I

    iget v7, v2, Lco/notix/u;->i:I

    iget v8, v2, Lco/notix/u;->h:I

    iget v9, v2, Lco/notix/u;->g:I

    iget v10, v2, Lco/notix/u;->f:I

    iget v11, v2, Lco/notix/u;->e:I

    iget v12, v2, Lco/notix/u;->d:I

    iget v13, v2, Lco/notix/u;->c:I

    iget-wide v14, v2, Lco/notix/u;->b:J

    move-object/from16 p1, v1

    iget-object v1, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_c

    :pswitch_2
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->k:I

    iget v4, v2, Lco/notix/u;->j:I

    iget v5, v2, Lco/notix/u;->i:I

    iget v6, v2, Lco/notix/u;->h:I

    iget v7, v2, Lco/notix/u;->g:I

    iget v8, v2, Lco/notix/u;->f:I

    iget v9, v2, Lco/notix/u;->e:I

    iget v10, v2, Lco/notix/u;->d:I

    iget v11, v2, Lco/notix/u;->c:I

    iget-wide v12, v2, Lco/notix/u;->b:J

    iget-object v14, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move v0, v4

    move v4, v1

    move-object v1, v14

    move-wide v14, v12

    move v13, v11

    move v11, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v0

    move-object/from16 v0, p1

    goto/16 :goto_b

    :pswitch_3
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->j:I

    iget v4, v2, Lco/notix/u;->i:I

    iget v5, v2, Lco/notix/u;->h:I

    iget v6, v2, Lco/notix/u;->g:I

    iget v7, v2, Lco/notix/u;->f:I

    iget v8, v2, Lco/notix/u;->e:I

    iget v9, v2, Lco/notix/u;->d:I

    iget v10, v2, Lco/notix/u;->c:I

    iget-wide v11, v2, Lco/notix/u;->b:J

    iget-object v13, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object v14, v13

    move v13, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_a

    :pswitch_4
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->i:I

    iget v4, v2, Lco/notix/u;->h:I

    iget v5, v2, Lco/notix/u;->g:I

    iget v6, v2, Lco/notix/u;->f:I

    iget v7, v2, Lco/notix/u;->e:I

    iget v8, v2, Lco/notix/u;->d:I

    iget v9, v2, Lco/notix/u;->c:I

    iget-wide v10, v2, Lco/notix/u;->b:J

    iget-object v12, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-wide/from16 v17, v10

    move-object v10, v12

    move-wide/from16 v12, v17

    move v11, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_9

    :pswitch_5
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->h:I

    iget v4, v2, Lco/notix/u;->g:I

    iget v5, v2, Lco/notix/u;->f:I

    iget v6, v2, Lco/notix/u;->e:I

    iget v7, v2, Lco/notix/u;->d:I

    iget v8, v2, Lco/notix/u;->c:I

    iget-wide v9, v2, Lco/notix/u;->b:J

    iget-object v11, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object v12, v11

    move v11, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_8

    :pswitch_6
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->g:I

    iget v4, v2, Lco/notix/u;->f:I

    iget v5, v2, Lco/notix/u;->e:I

    iget v6, v2, Lco/notix/u;->d:I

    iget v7, v2, Lco/notix/u;->c:I

    iget-wide v8, v2, Lco/notix/u;->b:J

    iget-object v10, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-wide/from16 v17, v8

    move-object v8, v10

    move-wide/from16 v10, v17

    move v9, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_7

    :pswitch_7
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->f:I

    iget v4, v2, Lco/notix/u;->e:I

    iget v5, v2, Lco/notix/u;->d:I

    iget v6, v2, Lco/notix/u;->c:I

    iget-wide v7, v2, Lco/notix/u;->b:J

    iget-object v9, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object v10, v9

    move v9, v6

    move v6, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_6

    :pswitch_8
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->e:I

    iget v4, v2, Lco/notix/u;->d:I

    iget v5, v2, Lco/notix/u;->c:I

    iget-wide v6, v2, Lco/notix/u;->b:J

    iget-object v8, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-wide/from16 v17, v6

    move-object v6, v8

    move-wide/from16 v8, v17

    move v7, v5

    move v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_5

    :pswitch_9
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->d:I

    iget v4, v2, Lco/notix/u;->c:I

    iget-wide v5, v2, Lco/notix/u;->b:J

    iget-object v7, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object v8, v7

    move v7, v4

    move v4, v1

    move-object/from16 v1, p1

    goto/16 :goto_4

    :pswitch_a
    move-object/from16 p1, v1

    iget v1, v2, Lco/notix/u;->c:I

    iget-wide v4, v2, Lco/notix/u;->b:J

    iget-object v6, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-object v7, v6

    move-wide v5, v4

    move v4, v1

    move-object/from16 v1, p1

    goto :goto_3

    :pswitch_b
    move-object/from16 p1, v1

    iget-wide v4, v2, Lco/notix/u;->b:J

    iget-object v1, v2, Lco/notix/u;->a:Lco/notix/l2;

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    move-wide v5, v4

    move-object/from16 v4, p1

    goto :goto_2

    :pswitch_c
    move-object/from16 p1, v1

    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v1, v0, Lco/notix/l2;->a:Lco/notix/er;

    iput-object v0, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v4, v2, Lco/notix/u;->b:J

    const/4 v6, 0x1

    iput v6, v2, Lco/notix/u;->p:I

    invoke-static {v1, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    :goto_1
    move-object v2, v3

    goto/16 :goto_d

    :cond_1
    move-wide v5, v4

    move-object v4, v1

    move-object v1, v0

    :goto_2
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget-object v7, v1, Lco/notix/l2;->b:Lco/notix/er;

    iput-object v1, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v5, v2, Lco/notix/u;->b:J

    iput v4, v2, Lco/notix/u;->c:I

    const/4 v8, 0x2

    iput v8, v2, Lco/notix/u;->p:I

    invoke-static {v7, v1, v5, v6, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v17, v7

    move-object v7, v1

    move-object/from16 v1, v17

    :goto_3
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v8, v7, Lco/notix/l2;->c:Lco/notix/er;

    iput-object v7, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v5, v2, Lco/notix/u;->b:J

    iput v4, v2, Lco/notix/u;->c:I

    iput v1, v2, Lco/notix/u;->d:I

    const/4 v9, 0x3

    iput v9, v2, Lco/notix/u;->p:I

    invoke-static {v8, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v17, v4

    move v4, v1

    move-object v1, v8

    move-object v8, v7

    move/from16 v7, v17

    :goto_4
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v9, v8, Lco/notix/l2;->d:Lco/notix/er;

    iput-object v8, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v5, v2, Lco/notix/u;->b:J

    iput v7, v2, Lco/notix/u;->c:I

    iput v4, v2, Lco/notix/u;->d:I

    iput v1, v2, Lco/notix/u;->e:I

    const/4 v10, 0x4

    iput v10, v2, Lco/notix/u;->p:I

    invoke-static {v9, v8, v5, v6, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_4

    goto :goto_1

    :cond_4
    move/from16 v17, v4

    move v4, v1

    move-object v1, v9

    move-wide/from16 v18, v5

    move/from16 v5, v17

    move-object v6, v8

    move-wide/from16 v8, v18

    :goto_5
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v10, v6, Lco/notix/l2;->e:Lco/notix/er;

    iput-object v6, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v8, v2, Lco/notix/u;->b:J

    iput v7, v2, Lco/notix/u;->c:I

    iput v5, v2, Lco/notix/u;->d:I

    iput v4, v2, Lco/notix/u;->e:I

    iput v1, v2, Lco/notix/u;->f:I

    const/4 v11, 0x5

    iput v11, v2, Lco/notix/u;->p:I

    invoke-static {v10, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_5

    goto/16 :goto_1

    :cond_5
    move/from16 v17, v4

    move v4, v1

    move-object v1, v10

    move-object v10, v6

    move v6, v5

    move/from16 v5, v17

    move-wide/from16 v17, v8

    move v9, v7

    move-wide/from16 v7, v17

    :goto_6
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v11, v10, Lco/notix/l2;->f:Lco/notix/er;

    iput-object v10, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v7, v2, Lco/notix/u;->b:J

    iput v9, v2, Lco/notix/u;->c:I

    iput v6, v2, Lco/notix/u;->d:I

    iput v5, v2, Lco/notix/u;->e:I

    iput v4, v2, Lco/notix/u;->f:I

    iput v1, v2, Lco/notix/u;->g:I

    const/4 v12, 0x6

    iput v12, v2, Lco/notix/u;->p:I

    invoke-static {v11, v10, v7, v8, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_6

    goto/16 :goto_1

    :cond_6
    move/from16 v17, v4

    move v4, v1

    move-object v1, v11

    move/from16 v18, v5

    move/from16 v5, v17

    move/from16 v17, v6

    move/from16 v6, v18

    move-wide/from16 v18, v7

    move/from16 v7, v17

    move-object v8, v10

    move-wide/from16 v10, v18

    :goto_7
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v12, v8, Lco/notix/l2;->g:Lco/notix/er;

    iput-object v8, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v10, v2, Lco/notix/u;->b:J

    iput v9, v2, Lco/notix/u;->c:I

    iput v7, v2, Lco/notix/u;->d:I

    iput v6, v2, Lco/notix/u;->e:I

    iput v5, v2, Lco/notix/u;->f:I

    iput v4, v2, Lco/notix/u;->g:I

    iput v1, v2, Lco/notix/u;->h:I

    const/4 v13, 0x7

    iput v13, v2, Lco/notix/u;->p:I

    invoke-static {v12, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_7

    goto/16 :goto_1

    :cond_7
    move/from16 v17, v4

    move v4, v1

    move-object v1, v12

    move-object v12, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move/from16 v5, v17

    move-wide/from16 v17, v10

    move v11, v9

    move-wide/from16 v9, v17

    :goto_8
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v13, v12, Lco/notix/l2;->h:Lco/notix/er;

    iput-object v12, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v9, v2, Lco/notix/u;->b:J

    iput v11, v2, Lco/notix/u;->c:I

    iput v8, v2, Lco/notix/u;->d:I

    iput v7, v2, Lco/notix/u;->e:I

    iput v6, v2, Lco/notix/u;->f:I

    iput v5, v2, Lco/notix/u;->g:I

    iput v4, v2, Lco/notix/u;->h:I

    iput v1, v2, Lco/notix/u;->i:I

    const/16 v14, 0x8

    iput v14, v2, Lco/notix/u;->p:I

    invoke-static {v13, v12, v9, v10, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v3, :cond_8

    goto/16 :goto_1

    :cond_8
    move/from16 v17, v4

    move v4, v1

    move-object v1, v13

    move/from16 v18, v5

    move/from16 v5, v17

    move/from16 v17, v6

    move/from16 v6, v18

    move/from16 v18, v7

    move/from16 v7, v17

    move/from16 v17, v8

    move/from16 v8, v18

    move-wide/from16 v18, v9

    move/from16 v9, v17

    move-object v10, v12

    move-wide/from16 v12, v18

    :goto_9
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v14, v10, Lco/notix/l2;->i:Lco/notix/er;

    iput-object v10, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v12, v2, Lco/notix/u;->b:J

    iput v11, v2, Lco/notix/u;->c:I

    iput v9, v2, Lco/notix/u;->d:I

    iput v8, v2, Lco/notix/u;->e:I

    iput v7, v2, Lco/notix/u;->f:I

    iput v6, v2, Lco/notix/u;->g:I

    iput v5, v2, Lco/notix/u;->h:I

    iput v4, v2, Lco/notix/u;->i:I

    iput v1, v2, Lco/notix/u;->j:I

    const/16 v15, 0x9

    iput v15, v2, Lco/notix/u;->p:I

    invoke-static {v14, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v3, :cond_9

    goto/16 :goto_1

    :cond_9
    move/from16 v17, v4

    move v4, v1

    move-object v1, v14

    move-object v14, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move/from16 v5, v17

    move-wide/from16 v17, v12

    move v13, v11

    move-wide/from16 v11, v17

    :goto_a
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v15, v14, Lco/notix/l2;->j:Lco/notix/er;

    iput-object v14, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v11, v2, Lco/notix/u;->b:J

    iput v13, v2, Lco/notix/u;->c:I

    iput v10, v2, Lco/notix/u;->d:I

    iput v9, v2, Lco/notix/u;->e:I

    iput v8, v2, Lco/notix/u;->f:I

    iput v7, v2, Lco/notix/u;->g:I

    iput v6, v2, Lco/notix/u;->h:I

    iput v5, v2, Lco/notix/u;->i:I

    iput v4, v2, Lco/notix/u;->j:I

    iput v1, v2, Lco/notix/u;->k:I

    const/16 v0, 0xa

    iput v0, v2, Lco/notix/u;->p:I

    invoke-static {v15, v14, v11, v12, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_a

    goto/16 :goto_1

    :cond_a
    move/from16 v17, v4

    move v4, v1

    move-object v1, v14

    move-wide v14, v11

    move v11, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move/from16 v5, v17

    :goto_b
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v12, v1, Lco/notix/l2;->k:Lco/notix/er;

    iput-object v1, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput-wide v14, v2, Lco/notix/u;->b:J

    iput v13, v2, Lco/notix/u;->c:I

    iput v11, v2, Lco/notix/u;->d:I

    iput v10, v2, Lco/notix/u;->e:I

    iput v9, v2, Lco/notix/u;->f:I

    iput v8, v2, Lco/notix/u;->g:I

    iput v7, v2, Lco/notix/u;->h:I

    iput v6, v2, Lco/notix/u;->i:I

    iput v5, v2, Lco/notix/u;->j:I

    iput v4, v2, Lco/notix/u;->k:I

    iput v0, v2, Lco/notix/u;->l:I

    move/from16 p1, v0

    const/16 v0, 0xb

    iput v0, v2, Lco/notix/u;->p:I

    invoke-static {v12, v2}, Lco/notix/l2;->c(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto/16 :goto_1

    :cond_b
    move v12, v11

    move v11, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    move v5, v4

    move/from16 v4, p1

    :goto_c
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move-object/from16 p1, v3

    iget-object v3, v1, Lco/notix/l2;->l:Lco/notix/er;

    move-object/from16 v16, v1

    const/4 v1, 0x0

    iput-object v1, v2, Lco/notix/u;->a:Lco/notix/l2;

    iput v13, v2, Lco/notix/u;->c:I

    iput v12, v2, Lco/notix/u;->d:I

    iput v11, v2, Lco/notix/u;->e:I

    iput v10, v2, Lco/notix/u;->f:I

    iput v9, v2, Lco/notix/u;->g:I

    iput v8, v2, Lco/notix/u;->h:I

    iput v7, v2, Lco/notix/u;->i:I

    iput v6, v2, Lco/notix/u;->j:I

    iput v5, v2, Lco/notix/u;->k:I

    iput v4, v2, Lco/notix/u;->l:I

    iput v0, v2, Lco/notix/u;->m:I

    const/16 v1, 0xc

    iput v1, v2, Lco/notix/u;->p:I

    move-object/from16 v1, v16

    invoke-static {v3, v1, v14, v15, v2}, Lco/notix/l2;->a(Lco/notix/er;Lco/notix/l2;JLE7/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, p1

    if-ne v1, v2, :cond_c

    :goto_d
    return-object v2

    :cond_c
    move v3, v12

    move v12, v4

    move v4, v3

    move v3, v11

    move v11, v5

    move v5, v3

    move v3, v10

    move v10, v6

    move v6, v3

    move v3, v9

    move v9, v7

    move v7, v3

    move v3, v13

    move v13, v0

    :goto_e
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v14

    new-instance v2, Lco/notix/o;

    invoke-direct/range {v2 .. v14}, Lco/notix/o;-><init>(IIIIIIIIIIII)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Lco/notix/er;LE7/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lco/notix/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/p;

    iget v1, v0, Lco/notix/p;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/p;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/p;

    invoke-direct {v0, p0, p2}, Lco/notix/p;-><init>(Lco/notix/l2;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/p;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/p;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v1, v0, Lco/notix/p;->b:J

    iget-object p1, v0, Lco/notix/p;->a:Lco/notix/l2;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide v4, v0, Lco/notix/p;->b:J

    iget-object p1, v0, Lco/notix/p;->a:Lco/notix/l2;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-object p0, v0, Lco/notix/p;->a:Lco/notix/l2;

    iput-wide v5, v0, Lco/notix/p;->b:J

    iput v4, v0, Lco/notix/p;->e:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    move-wide v4, v5

    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/q;

    invoke-direct {v2, p1, v4, v5}, Lco/notix/q;-><init>(Lco/notix/l2;J)V

    iput-object p1, v0, Lco/notix/p;->a:Lco/notix/l2;

    iput-wide v4, v0, Lco/notix/p;->b:J

    iput v3, v0, Lco/notix/p;->e:I

    invoke-virtual {p2, v2, v0}, Lco/notix/vh;->a(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-wide v1, v4

    :goto_3
    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v1, v2}, Lco/notix/l2;->a(Ljava/util/List;J)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    .line 2
    :goto_4
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object p2
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p1, Lco/notix/f2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/f2;

    iget v1, v0, Lco/notix/f2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/f2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/f2;

    invoke-direct {v0, p0, p1}, Lco/notix/f2;-><init>(Lco/notix/l2;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/f2;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/f2;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lco/notix/f2;->a:Lco/notix/l2;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/l2;->k:Lco/notix/er;

    iput-object p0, v0, Lco/notix/f2;->a:Lco/notix/l2;

    iput v4, v0, Lco/notix/f2;->d:I

    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lco/notix/l2;->l:Lco/notix/er;

    const/4 v4, 0x0

    iput-object v4, v0, Lco/notix/f2;->a:Lco/notix/l2;

    iput v3, v0, Lco/notix/f2;->d:I

    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final b(Lco/notix/er;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lco/notix/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/s;

    iget v1, v0, Lco/notix/s;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/s;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/s;

    invoke-direct {v0, p0, p2}, Lco/notix/s;-><init>(Lco/notix/l2;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/s;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/s;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iput v4, v0, Lco/notix/s;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    sget-object p1, Lco/notix/t;->a:Lco/notix/t;

    iput v3, v0, Lco/notix/s;->c:I

    invoke-virtual {p2, p1, v0}, Lco/notix/vh;->a(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final c(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 3
    instance-of v0, p1, Lco/notix/g2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/g2;

    iget v1, v0, Lco/notix/g2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/g2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/g2;

    invoke-direct {v0, p0, p1}, Lco/notix/g2;-><init>(Lco/notix/l2;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/g2;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/g2;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lco/notix/g2;->a:Lco/notix/l2;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/l2;->g:Lco/notix/er;

    iput-object p0, v0, Lco/notix/g2;->a:Lco/notix/l2;

    iput v4, v0, Lco/notix/g2;->d:I

    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lco/notix/l2;->h:Lco/notix/er;

    const/4 v4, 0x0

    iput-object v4, v0, Lco/notix/g2;->a:Lco/notix/l2;

    iput v3, v0, Lco/notix/g2;->d:I

    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final d(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/h2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/h2;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/h2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/h2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/h2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/h2;-><init>(Lco/notix/l2;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/h2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/h2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object v2, v0, Lco/notix/h2;->a:Lco/notix/l2;

    .line 52
    .line 53
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lco/notix/l2;->i:Lco/notix/er;

    .line 61
    .line 62
    iput-object p0, v0, Lco/notix/h2;->a:Lco/notix/l2;

    .line 63
    .line 64
    iput v4, v0, Lco/notix/h2;->d:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, p0

    .line 74
    :goto_1
    iget-object p1, v2, Lco/notix/l2;->j:Lco/notix/er;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    iput-object v4, v0, Lco/notix/h2;->a:Lco/notix/l2;

    .line 78
    .line 79
    iput v3, v0, Lco/notix/h2;->d:I

    .line 80
    .line 81
    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final e(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/i2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/i2;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/i2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/i2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/i2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/i2;-><init>(Lco/notix/l2;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/i2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/i2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object v2, v0, Lco/notix/i2;->a:Lco/notix/l2;

    .line 52
    .line 53
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lco/notix/l2;->e:Lco/notix/er;

    .line 61
    .line 62
    iput-object p0, v0, Lco/notix/i2;->a:Lco/notix/l2;

    .line 63
    .line 64
    iput v4, v0, Lco/notix/i2;->d:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, p0

    .line 74
    :goto_1
    iget-object p1, v2, Lco/notix/l2;->f:Lco/notix/er;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    iput-object v4, v0, Lco/notix/i2;->a:Lco/notix/l2;

    .line 78
    .line 79
    iput v3, v0, Lco/notix/i2;->d:I

    .line 80
    .line 81
    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final f(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/j2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/j2;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/j2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/j2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/j2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/j2;-><init>(Lco/notix/l2;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/j2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/j2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object v2, v0, Lco/notix/j2;->a:Lco/notix/l2;

    .line 52
    .line 53
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lco/notix/l2;->c:Lco/notix/er;

    .line 61
    .line 62
    iput-object p0, v0, Lco/notix/j2;->a:Lco/notix/l2;

    .line 63
    .line 64
    iput v4, v0, Lco/notix/j2;->d:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, p0

    .line 74
    :goto_1
    iget-object p1, v2, Lco/notix/l2;->d:Lco/notix/er;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    iput-object v4, v0, Lco/notix/j2;->a:Lco/notix/l2;

    .line 78
    .line 79
    iput v3, v0, Lco/notix/j2;->d:I

    .line 80
    .line 81
    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final g(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/k2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/k2;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/k2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/k2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/k2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/k2;-><init>(Lco/notix/l2;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/k2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/k2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object v2, v0, Lco/notix/k2;->a:Lco/notix/l2;

    .line 52
    .line 53
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lco/notix/l2;->a:Lco/notix/er;

    .line 61
    .line 62
    iput-object p0, v0, Lco/notix/k2;->a:Lco/notix/l2;

    .line 63
    .line 64
    iput v4, v0, Lco/notix/k2;->d:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lco/notix/l2;->b(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, p0

    .line 74
    :goto_1
    iget-object p1, v2, Lco/notix/l2;->b:Lco/notix/er;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    iput-object v4, v0, Lco/notix/k2;->a:Lco/notix/l2;

    .line 78
    .line 79
    iput v3, v0, Lco/notix/k2;->d:I

    .line 80
    .line 81
    invoke-virtual {v2, p1, v0}, Lco/notix/l2;->a(Lco/notix/er;LE7/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_5

    .line 86
    .line 87
    :goto_2
    return-object v1

    .line 88
    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 89
    .line 90
    return-object p1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
