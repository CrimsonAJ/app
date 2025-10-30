.class public final Lco/notix/lm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/yl;


# static fields
.field public static final f:J


# instance fields
.field public final a:Lco/notix/xl;

.field public final b:Lco/notix/y8;

.field public final c:Lco/notix/vn;

.field public final d:Lco/notix/mq;

.field public final e:Lg8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/lm;->f:J

    return-void
.end method

.method public constructor <init>(Lco/notix/xl;Lco/notix/d9;Lco/notix/vn;Lco/notix/mq;)V
    .locals 1

    const-string v0, "remoteLoggerDataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteLoggerStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/lm;->a:Lco/notix/xl;

    iput-object p2, p0, Lco/notix/lm;->b:Lco/notix/y8;

    iput-object p3, p0, Lco/notix/lm;->c:Lco/notix/vn;

    iput-object p4, p0, Lco/notix/lm;->d:Lco/notix/mq;

    invoke-static {}, Lg8/e;->a()Lg8/d;

    move-result-object p1

    iput-object p1, p0, Lco/notix/lm;->e:Lg8/a;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lco/notix/zl;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/zl;

    iget v1, v0, Lco/notix/zl;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/zl;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/zl;

    invoke-direct {v0, p0, p1}, Lco/notix/zl;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/zl;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/zl;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/lm;->d:Lco/notix/mq;

    iput v3, v0, Lco/notix/zl;->c:I

    invoke-virtual {p1, v0}, Lco/notix/mq;->g(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lco/notix/rp;

    if-eqz p1, :cond_4

    .line 27
    iget-object p1, p1, Lco/notix/rp;->c:Lco/notix/qp;

    if-eqz p1, :cond_4

    .line 28
    iget-object p1, p1, Lco/notix/qp;->d:Ljava/lang/Long;

    if-eqz p1, :cond_4

    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    :goto_2
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    goto :goto_3

    :cond_4
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1

    goto :goto_2

    .line 30
    :goto_3
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    return-object p1
.end method

.method public final a(Lco/notix/ll;LE7/d;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lco/notix/em;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lco/notix/em;

    iget v3, v2, Lco/notix/em;->j:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lco/notix/em;->j:I

    goto :goto_0

    :cond_0
    new-instance v2, Lco/notix/em;

    invoke-direct {v2, v1, v0}, Lco/notix/em;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object v0, v2, Lco/notix/em;->h:Ljava/lang/Object;

    sget-object v3, LF7/a;->a:LF7/a;

    iget v4, v2, Lco/notix/em;->j:I

    const/4 v5, 0x0

    const-string v6, "Log rate limit exceeded for level"

    const/4 v7, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-wide v3, v2, Lco/notix/em;->f:J

    iget-object v5, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v5, Lg8/a;

    iget-object v2, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v2, Lco/notix/ll;

    :try_start_0
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    .line 1
    :pswitch_1
    iget-wide v4, v2, Lco/notix/em;->g:J

    iget-wide v8, v2, Lco/notix/em;->f:J

    iget-object v6, v2, Lco/notix/em;->d:Ljava/util/List;

    iget-object v10, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v11, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v11, Lco/notix/ll;

    iget-object v12, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v12, Lco/notix/lm;

    :try_start_1
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object/from16 v22, v11

    move-object v11, v6

    move-object/from16 v6, v22

    goto/16 :goto_a

    :pswitch_2
    iget-wide v8, v2, Lco/notix/em;->f:J

    iget-object v4, v2, Lco/notix/em;->d:Ljava/util/List;

    iget-object v10, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v6, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v6, Lco/notix/ll;

    iget-object v11, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v11, Lco/notix/lm;

    :try_start_2
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-object v12, v11

    goto/16 :goto_7

    :pswitch_3
    iget-wide v8, v2, Lco/notix/em;->f:J

    iget-object v4, v2, Lco/notix/em;->e:Lco/notix/ql;

    iget-object v10, v2, Lco/notix/em;->d:Ljava/util/List;

    iget-object v11, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v12, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v12, Lco/notix/ll;

    iget-object v13, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v13, Lco/notix/lm;

    :try_start_3
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object/from16 v22, v12

    move-object v12, v10

    move-object/from16 v10, v22

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    goto/16 :goto_e

    :pswitch_4
    iget-wide v8, v2, Lco/notix/em;->f:J

    iget-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v10, Lco/notix/ll;

    iget-object v11, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v11, Lco/notix/lm;

    :try_start_4
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_1
    move-object v13, v11

    goto/16 :goto_5

    :pswitch_5
    iget-wide v8, v2, Lco/notix/em;->f:J

    iget-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v10, Lco/notix/ll;

    iget-object v11, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v11, Lco/notix/lm;

    :try_start_5
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_4

    :pswitch_6
    iget-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v8, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v8, Lco/notix/ll;

    iget-object v9, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v9, Lco/notix/lm;

    :try_start_6
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v10, v8

    :goto_1
    move-object v11, v9

    goto :goto_3

    :catchall_2
    move-exception v0

    goto/16 :goto_14

    :pswitch_7
    iget-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iget-object v8, v2, Lco/notix/em;->b:Ljava/lang/Object;

    check-cast v8, Lco/notix/ll;

    iget-object v9, v2, Lco/notix/em;->a:Ljava/lang/Object;

    check-cast v9, Lco/notix/lm;

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    move-object/from16 v22, v8

    move-object v8, v4

    move-object/from16 v4, v22

    goto :goto_2

    :pswitch_8
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    iget-object v0, v1, Lco/notix/lm;->e:Lg8/a;

    iput-object v1, v2, Lco/notix/em;->a:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v0, v2, Lco/notix/em;->c:Lg8/a;

    const/4 v8, 0x1

    iput v8, v2, Lco/notix/em;->j:I

    invoke-interface {v0, v2}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_2

    goto/16 :goto_b

    :cond_2
    move-object v8, v0

    move-object v9, v1

    :goto_2
    :try_start_7
    iput-object v9, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v4, v2, Lco/notix/em;->b:Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    iput-object v8, v2, Lco/notix/em;->c:Lg8/a;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    const/4 v0, 0x2

    :try_start_9
    iput v0, v2, Lco/notix/em;->j:I

    invoke-virtual {v9, v2}, Lco/notix/lm;->a(LE7/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-ne v0, v3, :cond_3

    goto/16 :goto_b

    :cond_3
    move-object v10, v4

    move-object v4, v8

    goto :goto_1

    :goto_3
    :try_start_a
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, v10, Lco/notix/ll;->b:Ljava/lang/String;

    .line 3
    invoke-static {v0, v6, v5}, LW7/l;->L(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 4
    iput-object v11, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iput-wide v8, v2, Lco/notix/em;->f:J

    const/4 v0, 0x3

    iput v0, v2, Lco/notix/em;->j:I

    invoke-virtual {v11, v2}, Lco/notix/lm;->d(LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto/16 :goto_b

    :cond_4
    :goto_4
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    add-long/2addr v12, v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    cmp-long v0, v12, v14

    if-lez v0, :cond_5

    invoke-interface {v4, v7}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v7

    :cond_5
    :try_start_b
    iget-object v0, v11, Lco/notix/lm;->c:Lco/notix/vn;

    new-instance v12, Lco/notix/fm;

    invoke-direct {v12, v10}, Lco/notix/fm;-><init>(Lco/notix/ll;)V

    iput-object v11, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iput-wide v8, v2, Lco/notix/em;->f:J

    const/4 v13, 0x4

    iput v13, v2, Lco/notix/em;->j:I

    invoke-virtual {v0, v12, v2}, Lco/notix/vn;->a(Lco/notix/fm;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_1

    goto/16 :goto_b

    :goto_5
    check-cast v0, Ljava/util/List;

    .line 5
    iget-object v11, v10, Lco/notix/ll;->a:Lco/notix/ql;

    .line 6
    iput-object v13, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v4, v2, Lco/notix/em;->c:Lg8/a;

    iput-object v0, v2, Lco/notix/em;->d:Ljava/util/List;

    iput-object v11, v2, Lco/notix/em;->e:Lco/notix/ql;

    iput-wide v8, v2, Lco/notix/em;->f:J

    const/4 v12, 0x5

    iput v12, v2, Lco/notix/em;->j:I

    invoke-virtual {v13, v2}, Lco/notix/lm;->c(LE7/d;)Ljava/lang/Object;

    move-result-object v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-ne v12, v3, :cond_6

    goto/16 :goto_b

    :cond_6
    move-object/from16 v22, v12

    move-object v12, v0

    move-object/from16 v0, v22

    move-object/from16 v22, v11

    move-object v11, v4

    move-object/from16 v4, v22

    :goto_6
    :try_start_c
    check-cast v0, Ljava/lang/Enum;

    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    if-lez v0, :cond_7

    invoke-interface {v11, v7}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v7

    :cond_7
    :try_start_d
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    iget-object v0, v10, Lco/notix/ll;->b:Ljava/lang/String;

    .line 8
    invoke-static {v0, v6, v5}, LW7/l;->L(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_10

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iget-object v0, v13, Lco/notix/lm;->c:Lco/notix/vn;

    new-instance v4, Lco/notix/gm;

    invoke-direct {v4, v10, v14, v15}, Lco/notix/gm;-><init>(Lco/notix/ll;J)V

    iput-object v13, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v11, v2, Lco/notix/em;->c:Lg8/a;

    iput-object v12, v2, Lco/notix/em;->d:Ljava/util/List;

    iput-object v7, v2, Lco/notix/em;->e:Lco/notix/ql;

    iput-wide v8, v2, Lco/notix/em;->f:J

    const/4 v6, 0x6

    iput v6, v2, Lco/notix/em;->j:I

    invoke-virtual {v0, v4, v2}, Lco/notix/vn;->a(Lco/notix/gm;LE7/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    if-ne v0, v3, :cond_8

    goto/16 :goto_b

    :cond_8
    move-object v6, v10

    move-object v10, v11

    move-object v4, v12

    move-object v12, v13

    :goto_7
    :try_start_e
    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_9

    :cond_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/notix/qo;

    .line 10
    iget-object v11, v11, Lco/notix/qo;->b:Lco/notix/ql;

    .line 11
    iget-object v13, v6, Lco/notix/ll;->a:Lco/notix/ql;

    if-ne v11, v13, :cond_a

    add-int/lit8 v5, v5, 0x1

    if-ltz v5, :cond_b

    goto :goto_8

    .line 12
    :cond_b
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v2, "Count overflow has happened."

    invoke-direct {v0, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_9
    int-to-long v13, v5

    .line 13
    iget-object v0, v6, Lco/notix/ll;->a:Lco/notix/ql;

    .line 14
    iput-object v12, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v6, v2, Lco/notix/em;->b:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->c:Lg8/a;

    iput-object v4, v2, Lco/notix/em;->d:Ljava/util/List;

    iput-wide v8, v2, Lco/notix/em;->f:J

    iput-wide v13, v2, Lco/notix/em;->g:J

    const/4 v5, 0x7

    iput v5, v2, Lco/notix/em;->j:I

    invoke-virtual {v12, v0, v2}, Lco/notix/lm;->a(Lco/notix/ql;LE7/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    if-ne v0, v3, :cond_d

    goto :goto_b

    :cond_d
    move-object v11, v4

    move-wide v4, v13

    :goto_a
    :try_start_f
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v13

    cmp-long v0, v4, v13

    if-ltz v0, :cond_f

    iget-object v0, v12, Lco/notix/lm;->c:Lco/notix/vn;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-object v6, v2, Lco/notix/em;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/em;->b:Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    iput-object v7, v2, Lco/notix/em;->c:Lg8/a;

    iput-object v7, v2, Lco/notix/em;->d:Ljava/util/List;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :try_start_11
    iput-wide v8, v2, Lco/notix/em;->f:J

    const/16 v11, 0x8

    iput v11, v2, Lco/notix/em;->j:I

    invoke-virtual {v0, v4, v5, v2}, Lco/notix/vn;->a(JLE7/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    if-ne v0, v3, :cond_e

    :goto_b
    return-object v3

    :cond_e
    move-object v2, v6

    move-wide v3, v8

    move-object v5, v10

    :goto_c
    :try_start_12
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Log rate limit exceeded for level "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    iget-object v2, v2, Lco/notix/ll;->a:Lco/notix/ql;

    .line 16
    iget-object v2, v2, Lco/notix/ql;->a:Ljava/lang/String;

    .line 17
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Going silent for "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/notix/kd;->a(Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    invoke-interface {v5, v7}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v7

    :catchall_3
    move-exception v0

    move-object v11, v10

    goto :goto_e

    :catchall_4
    move-exception v0

    :goto_d
    move-object v4, v10

    goto :goto_14

    :cond_f
    move-object v5, v10

    move-object v12, v11

    move-object v10, v6

    goto :goto_f

    :goto_e
    move-object v4, v11

    goto :goto_14

    :catchall_5
    move-exception v0

    move-object v10, v11

    goto :goto_d

    :cond_10
    move-object v5, v11

    :goto_f
    :try_start_13
    new-instance v13, Lco/notix/pl;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v0, "randomUUID().toString()"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v15, v10, Lco/notix/ll;->a:Lco/notix/ql;

    .line 19
    iget-object v0, v10, Lco/notix/ll;->b:Ljava/lang/String;

    const/16 v2, 0xc8

    .line 20
    invoke-static {v2, v0}, LW7/d;->h0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 21
    iget-object v0, v10, Lco/notix/ll;->c:Ljava/lang/String;

    if-eqz v0, :cond_11

    const/16 v2, 0xbb8

    .line 22
    invoke-static {v2, v0}, LW7/d;->h0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_10

    :cond_11
    move-object/from16 v17, v7

    .line 23
    :goto_10
    iget-wide v2, v10, Lco/notix/ll;->d:J

    .line 24
    iget-object v0, v10, Lco/notix/ll;->e:Ljava/util/Map;

    .line 25
    iget-boolean v4, v10, Lco/notix/ll;->f:Z

    if-eqz v4, :cond_12

    move-object/from16 v21, v12

    :goto_11
    move-object/from16 v20, v0

    move-wide/from16 v18, v2

    goto :goto_12

    :cond_12
    move-object/from16 v21, v7

    goto :goto_11

    .line 26
    :goto_12
    invoke-direct/range {v13 .. v21}, Lco/notix/pl;-><init>(Ljava/lang/String;Lco/notix/ql;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    invoke-interface {v5, v7}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v13

    :catchall_6
    move-exception v0

    move-object v5, v8

    goto :goto_13

    :catchall_7
    move-exception v0

    move-object v4, v8

    goto :goto_14

    :goto_13
    move-object v4, v5

    :goto_14
    invoke-interface {v4, v7}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final a(Lco/notix/ql;LE7/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lco/notix/bm;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/bm;

    iget v1, v0, Lco/notix/bm;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/bm;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/bm;

    invoke-direct {v0, p0, p2}, Lco/notix/bm;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/bm;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/bm;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/bm;->a:Lco/notix/ql;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/lm;->d:Lco/notix/mq;

    iput-object p1, v0, Lco/notix/bm;->a:Lco/notix/ql;

    iput v3, v0, Lco/notix/bm;->d:I

    invoke-virtual {p2, v0}, Lco/notix/mq;->g(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lco/notix/rp;

    if-eqz p2, :cond_4

    .line 31
    iget-object p2, p2, Lco/notix/rp;->c:Lco/notix/qp;

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    .line 32
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x3

    if-eq p1, v0, :cond_6

    if-eqz p2, :cond_5

    .line 33
    iget-object p1, p2, Lco/notix/qp;->c:Ljava/lang/Long;

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    const-wide/16 p1, 0x14

    goto :goto_4

    :cond_6
    if-eqz p2, :cond_7

    .line 34
    iget-object p1, p2, Lco/notix/qp;->a:Ljava/lang/Long;

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const-wide/16 p1, 0x1f4

    goto :goto_4

    :cond_8
    if-eqz p2, :cond_9

    .line 35
    iget-object p1, p2, Lco/notix/qp;->b:Ljava/lang/Long;

    if-eqz p1, :cond_9

    .line 36
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    goto :goto_4

    :cond_9
    const-wide/16 p1, 0x1e

    .line 37
    :goto_4
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    return-object v0
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lco/notix/am;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/am;

    iget v1, v0, Lco/notix/am;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/am;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/am;

    invoke-direct {v0, p0, p1}, Lco/notix/am;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/am;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/am;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/lm;->d:Lco/notix/mq;

    iput v3, v0, Lco/notix/am;->c:I

    invoke-virtual {p1, v0}, Lco/notix/mq;->g(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lco/notix/rp;

    if-eqz p1, :cond_4

    .line 7
    iget-object p1, p1, Lco/notix/rp;->b:Ljava/lang/Long;

    if-eqz p1, :cond_4

    .line 8
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_2

    :cond_4
    const-wide/16 v0, 0x3e8

    .line 9
    :goto_2
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    return-object p1
.end method

.method public final b(Lco/notix/ll;LE7/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lco/notix/im;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lco/notix/im;

    iget v3, v2, Lco/notix/im;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lco/notix/im;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, Lco/notix/im;

    invoke-direct {v2, v1, v0}, Lco/notix/im;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object v0, v2, Lco/notix/im;->c:Ljava/lang/Object;

    sget-object v3, LF7/a;->a:LF7/a;

    iget v4, v2, Lco/notix/im;->e:I

    sget-object v5, LA7/n;->a:LA7/n;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    return-object v5

    .line 1
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lco/notix/im;->b:Ljava/lang/Object;

    check-cast v4, Lco/notix/vn;

    iget-object v7, v2, Lco/notix/im;->a:Ljava/lang/Object;

    check-cast v7, Lco/notix/pl;

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object v4, v2, Lco/notix/im;->b:Ljava/lang/Object;

    check-cast v4, Lco/notix/pl;

    iget-object v8, v2, Lco/notix/im;->a:Ljava/lang/Object;

    check-cast v8, Lco/notix/lm;

    :try_start_0
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_4
    iget-object v4, v2, Lco/notix/im;->a:Ljava/lang/Object;

    check-cast v4, Lco/notix/lm;

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    iput-object v1, v2, Lco/notix/im;->a:Ljava/lang/Object;

    iput v9, v2, Lco/notix/im;->e:I

    move-object/from16 v0, p1

    invoke-virtual {v1, v0, v2}, Lco/notix/lm;->a(Lco/notix/ll;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v4, v1

    :goto_1
    move-object v9, v0

    check-cast v9, Lco/notix/pl;

    if-nez v9, :cond_7

    goto/16 :goto_7

    :cond_7
    :try_start_1
    iget-object v0, v4, Lco/notix/lm;->a:Lco/notix/xl;

    invoke-static {v9}, LB6/u0;->D(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    .line 2
    iget-object v11, v4, Lco/notix/lm;->b:Lco/notix/y8;

    check-cast v11, Lco/notix/d9;

    invoke-virtual {v11}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    const-string v14, "context.packageManager"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    const-string v14, "context.packageName"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v11}, Lco/notix/f7;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v11

    new-instance v13, Lco/notix/xn;

    move-object v14, v13

    sget-object v13, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v15, "MANUFACTURER"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v14

    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v6, "MODEL"

    invoke-static {v14, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v15

    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v11, v11, Landroid/content/pm/PackageInfo;->versionCode:I

    move/from16 v16, v11

    move-object v11, v6

    invoke-direct/range {v11 .. v16}, Lco/notix/xn;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v14, v11

    .line 3
    iput-object v4, v2, Lco/notix/im;->a:Ljava/lang/Object;

    iput-object v9, v2, Lco/notix/im;->b:Ljava/lang/Object;

    iput v8, v2, Lco/notix/im;->e:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    sget-object v6, LY7/K;->b:Lf8/d;

    .line 5
    new-instance v8, Lco/notix/wl;

    invoke-direct {v8, v0, v14, v10}, Lco/notix/wl;-><init>(Lco/notix/xl;Lco/notix/xn;LE7/d;)V

    invoke-static {v6, v8, v2}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_8

    goto :goto_6

    :cond_8
    move-object v8, v4

    move-object v4, v9

    .line 6
    :goto_2
    :try_start_2
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v8, v4

    move-object v4, v9

    :goto_3
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v0

    :goto_4
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_9

    check-cast v0, Ljava/lang/String;

    goto :goto_7

    :cond_9
    iget-object v0, v8, Lco/notix/lm;->c:Lco/notix/vn;

    iput-object v4, v2, Lco/notix/im;->a:Ljava/lang/Object;

    iput-object v0, v2, Lco/notix/im;->b:Ljava/lang/Object;

    iput v7, v2, Lco/notix/im;->e:I

    invoke-virtual {v8, v2}, Lco/notix/lm;->b(LE7/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    goto :goto_6

    :cond_a
    move-object v7, v4

    move-object v4, v0

    move-object v0, v6

    :goto_5
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    iput-object v10, v2, Lco/notix/im;->a:Ljava/lang/Object;

    iput-object v10, v2, Lco/notix/im;->b:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v2, Lco/notix/im;->e:I

    invoke-virtual {v4, v7, v8, v9, v2}, Lco/notix/vn;->a(Lco/notix/pl;JLE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    :goto_6
    return-object v3

    :cond_b
    :goto_7
    return-object v5
.end method

.method public final c(LE7/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lco/notix/cm;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/cm;

    iget v1, v0, Lco/notix/cm;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/cm;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/cm;

    invoke-direct {v0, p0, p1}, Lco/notix/cm;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/cm;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/cm;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/lm;->d:Lco/notix/mq;

    iput v3, v0, Lco/notix/cm;->c:I

    invoke-virtual {p1, v0}, Lco/notix/mq;->g(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lco/notix/rp;

    if-eqz p1, :cond_5

    .line 1
    iget-object p1, p1, Lco/notix/rp;->a:Lco/notix/ql;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    return-object p1

    .line 2
    :cond_5
    :goto_2
    sget-object p1, Lco/notix/ql;->b:Lco/notix/ql;

    return-object p1
.end method

.method public final c(Lco/notix/ll;LE7/d;)Ljava/lang/Object;
    .locals 8

    .line 3
    instance-of v0, p2, Lco/notix/jm;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/jm;

    iget v1, v0, Lco/notix/jm;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/jm;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/jm;

    invoke-direct {v0, p0, p2}, Lco/notix/jm;-><init>(Lco/notix/lm;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/jm;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/jm;->e:I

    sget-object v3, LA7/n;->a:LA7/n;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/jm;->b:Lco/notix/pl;

    iget-object v2, v0, Lco/notix/jm;->a:Ljava/lang/Object;

    check-cast v2, Lco/notix/vn;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lco/notix/jm;->a:Ljava/lang/Object;

    check-cast p1, Lco/notix/lm;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iput-object p0, v0, Lco/notix/jm;->a:Ljava/lang/Object;

    iput v6, v0, Lco/notix/jm;->e:I

    invoke-virtual {p0, p1, v0}, Lco/notix/lm;->a(Lco/notix/ll;LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, p0

    :goto_1
    check-cast p2, Lco/notix/pl;

    if-nez p2, :cond_6

    return-object v3

    :cond_6
    iget-object v2, p1, Lco/notix/lm;->c:Lco/notix/vn;

    iput-object v2, v0, Lco/notix/jm;->a:Ljava/lang/Object;

    iput-object p2, v0, Lco/notix/jm;->b:Lco/notix/pl;

    iput v5, v0, Lco/notix/jm;->e:I

    invoke-virtual {p1, v0}, Lco/notix/lm;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_2
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const/4 p2, 0x0

    iput-object p2, v0, Lco/notix/jm;->a:Ljava/lang/Object;

    iput-object p2, v0, Lco/notix/jm;->b:Lco/notix/pl;

    iput v4, v0, Lco/notix/jm;->e:I

    invoke-virtual {v2, p1, v5, v6, v0}, Lco/notix/vn;->a(Lco/notix/pl;JLE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    return-object v3
.end method

.method public final d(LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lco/notix/dm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/dm;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/dm;->c:I

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
    iput v1, v0, Lco/notix/dm;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/dm;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/dm;-><init>(Lco/notix/lm;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/dm;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/dm;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lco/notix/lm;->c:Lco/notix/vn;

    .line 52
    .line 53
    iput v3, v0, Lco/notix/dm;->c:I

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lco/notix/vn;->b(LE7/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Long;

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const-wide/16 v0, 0x0

    .line 72
    .line 73
    :goto_2
    new-instance p1, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 76
    .line 77
    .line 78
    return-object p1
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

.method public final e(LE7/d;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lco/notix/hm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/hm;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/hm;->e:I

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
    iput v1, v0, Lco/notix/hm;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/hm;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/hm;-><init>(Lco/notix/lm;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/hm;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/hm;->e:I

    .line 30
    .line 31
    sget-object v3, LA7/n;->a:LA7/n;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-eq v2, v6, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object v2, v0, Lco/notix/hm;->b:Ljava/util/List;

    .line 57
    .line 58
    iget-object v4, v0, Lco/notix/hm;->a:Lco/notix/lm;

    .line 59
    .line 60
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-object v2, v0, Lco/notix/hm;->a:Lco/notix/lm;

    .line 65
    .line 66
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v4, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lco/notix/lm;->c:Lco/notix/vn;

    .line 75
    .line 76
    iput-object p0, v0, Lco/notix/hm;->a:Lco/notix/lm;

    .line 77
    .line 78
    iput v4, v0, Lco/notix/hm;->e:I

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lco/notix/vn;->a(LE7/d;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v1, :cond_5

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    move-object v4, p0

    .line 88
    :goto_1
    move-object v2, p1

    .line 89
    check-cast v2, Ljava/util/List;

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    iput-object v4, v0, Lco/notix/hm;->a:Lco/notix/lm;

    .line 95
    .line 96
    iput-object v2, v0, Lco/notix/hm;->b:Ljava/util/List;

    .line 97
    .line 98
    iput v6, v0, Lco/notix/hm;->e:I

    .line 99
    .line 100
    invoke-virtual {v4, v0}, Lco/notix/lm;->c(LE7/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v1, :cond_7

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_7
    :goto_2
    check-cast p1, Lco/notix/ql;

    .line 108
    .line 109
    new-instance v6, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_9

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    move-object v8, v7

    .line 129
    check-cast v8, Lco/notix/pl;

    .line 130
    .line 131
    iget-object v8, v8, Lco/notix/pl;->b:Lco/notix/ql;

    .line 132
    .line 133
    invoke-virtual {v8, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-lez v8, :cond_8

    .line 138
    .line 139
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    .line 144
    .line 145
    const/16 v2, 0xa

    .line 146
    .line 147
    invoke-static {v6, v2}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    const/4 v7, 0x0

    .line 159
    :goto_4
    if-ge v7, v2, :cond_a

    .line 160
    .line 161
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    check-cast v8, Lco/notix/pl;

    .line 168
    .line 169
    iget-object v8, v8, Lco/notix/pl;->a:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_a
    invoke-static {p1}, LB7/k;->K0(Ljava/util/Collection;)Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object v2, v4, Lco/notix/lm;->c:Lco/notix/vn;

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    iput-object v4, v0, Lco/notix/hm;->a:Lco/notix/lm;

    .line 183
    .line 184
    iput-object v4, v0, Lco/notix/hm;->b:Ljava/util/List;

    .line 185
    .line 186
    iput v5, v0, Lco/notix/hm;->e:I

    .line 187
    .line 188
    invoke-virtual {v2, p1, v0}, Lco/notix/vn;->a(Ljava/util/Set;LE7/d;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-ne p1, v1, :cond_b

    .line 193
    .line 194
    :goto_5
    return-object v1

    .line 195
    :cond_b
    :goto_6
    return-object v3
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

.method public final f(LE7/d;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lco/notix/km;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lco/notix/km;

    .line 11
    .line 12
    iget v3, v2, Lco/notix/km;->h:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lco/notix/km;->h:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lco/notix/km;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lco/notix/km;-><init>(Lco/notix/lm;LE7/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lco/notix/km;->f:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, LF7/a;->a:LF7/a;

    .line 32
    .line 33
    iget v4, v2, Lco/notix/km;->h:I

    .line 34
    .line 35
    sget-object v5, LA7/n;->a:LA7/n;

    .line 36
    .line 37
    const/16 v6, 0x1e

    .line 38
    .line 39
    const/4 v7, 0x5

    .line 40
    const/4 v8, 0x4

    .line 41
    const/4 v9, 0x3

    .line 42
    const/4 v10, 0x2

    .line 43
    const/4 v11, 0x1

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eqz v4, :cond_6

    .line 46
    .line 47
    if-eq v4, v11, :cond_5

    .line 48
    .line 49
    if-eq v4, v10, :cond_4

    .line 50
    .line 51
    if-eq v4, v9, :cond_3

    .line 52
    .line 53
    if-eq v4, v8, :cond_2

    .line 54
    .line 55
    if-ne v4, v7, :cond_1

    .line 56
    .line 57
    iget-object v4, v2, Lco/notix/km;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v10, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 60
    .line 61
    iget-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 62
    .line 63
    iget-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 64
    .line 65
    iget-object v14, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v14, Lco/notix/ql;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto/16 :goto_a

    .line 73
    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto/16 :goto_c

    .line 76
    .line 77
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    iget-object v4, v2, Lco/notix/km;->e:Ljava/util/List;

    .line 86
    .line 87
    iget-object v10, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 88
    .line 89
    iget-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 90
    .line 91
    iget-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 92
    .line 93
    iget-object v14, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v14, Lco/notix/ql;

    .line 96
    .line 97
    :try_start_1
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    goto/16 :goto_7

    .line 101
    .line 102
    :cond_3
    iget-object v4, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 103
    .line 104
    iget-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 105
    .line 106
    iget-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 107
    .line 108
    iget-object v10, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v10, Lco/notix/ql;

    .line 111
    .line 112
    :try_start_2
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    iget-object v4, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v4, Lco/notix/lm;

    .line 119
    .line 120
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    iget-object v4, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v4, Lco/notix/lm;

    .line 127
    .line 128
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iput-object v1, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 136
    .line 137
    iput v11, v2, Lco/notix/km;->h:I

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lco/notix/lm;->e(LE7/d;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-ne v0, v3, :cond_7

    .line 144
    .line 145
    goto/16 :goto_9

    .line 146
    .line 147
    :cond_7
    move-object v4, v1

    .line 148
    :goto_1
    iput-object v4, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 149
    .line 150
    iput v10, v2, Lco/notix/km;->h:I

    .line 151
    .line 152
    invoke-virtual {v4, v2}, Lco/notix/lm;->c(LE7/d;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-ne v0, v3, :cond_8

    .line 157
    .line 158
    goto/16 :goto_9

    .line 159
    .line 160
    :cond_8
    :goto_2
    check-cast v0, Lco/notix/ql;

    .line 161
    .line 162
    new-instance v10, Lkotlin/jvm/internal/m;

    .line 163
    .line 164
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    new-instance v11, Lkotlin/jvm/internal/m;

    .line 168
    .line 169
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    move-object v13, v10

    .line 173
    move-object v10, v0

    .line 174
    :goto_3
    :try_start_3
    iget-object v0, v4, Lco/notix/lm;->c:Lco/notix/vn;

    .line 175
    .line 176
    iput-object v10, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 179
    .line 180
    iput-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 181
    .line 182
    iput-object v4, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 183
    .line 184
    iput-object v12, v2, Lco/notix/km;->e:Ljava/util/List;

    .line 185
    .line 186
    iput v9, v2, Lco/notix/km;->h:I

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Lco/notix/vn;->a(LE7/d;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-ne v0, v3, :cond_9

    .line 193
    .line 194
    goto/16 :goto_9

    .line 195
    .line 196
    :cond_9
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 197
    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    new-instance v14, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-eqz v15, :cond_c

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object v9, v15

    .line 220
    check-cast v9, Lco/notix/pl;

    .line 221
    .line 222
    iget-object v9, v9, Lco/notix/pl;->b:Lco/notix/ql;

    .line 223
    .line 224
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-gtz v9, :cond_a

    .line 229
    .line 230
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    :cond_a
    const/4 v9, 0x3

    .line 234
    goto :goto_5

    .line 235
    :cond_b
    move-object v14, v12

    .line 236
    :cond_c
    if-eqz v14, :cond_d

    .line 237
    .line 238
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    goto :goto_6

    .line 243
    :cond_d
    const/4 v0, 0x0

    .line 244
    :goto_6
    iput v0, v13, Lkotlin/jvm/internal/m;->a:I

    .line 245
    .line 246
    if-eqz v0, :cond_12

    .line 247
    .line 248
    if-eqz v14, :cond_12

    .line 249
    .line 250
    invoke-static {v14, v6}, LB7/k;->D0(Ljava/util/List;I)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v16

    .line 254
    iget-object v0, v4, Lco/notix/lm;->b:Lco/notix/y8;

    .line 255
    .line 256
    check-cast v0, Lco/notix/d9;

    .line 257
    .line 258
    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    const-string v14, "context.packageManager"

    .line 267
    .line 268
    invoke-static {v9, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const-string v14, "context.packageName"

    .line 276
    .line 277
    invoke-static {v0, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v9, v0}, Lco/notix/f7;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    new-instance v15, Lco/notix/xn;

    .line 285
    .line 286
    sget-object v9, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 287
    .line 288
    const-string v14, "MANUFACTURER"

    .line 289
    .line 290
    invoke-static {v9, v14}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 294
    .line 295
    const-string v6, "MODEL"

    .line 296
    .line 297
    invoke-static {v14, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    sget v19, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 301
    .line 302
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 303
    .line 304
    move/from16 v20, v0

    .line 305
    .line 306
    move-object/from16 v17, v9

    .line 307
    .line 308
    move-object/from16 v18, v14

    .line 309
    .line 310
    invoke-direct/range {v15 .. v20}, Lco/notix/xn;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v0, v16

    .line 314
    .line 315
    iget-object v6, v4, Lco/notix/lm;->a:Lco/notix/xl;

    .line 316
    .line 317
    iput-object v10, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 318
    .line 319
    iput-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 320
    .line 321
    iput-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 322
    .line 323
    iput-object v4, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 324
    .line 325
    iput-object v0, v2, Lco/notix/km;->e:Ljava/util/List;

    .line 326
    .line 327
    iput v8, v2, Lco/notix/km;->h:I

    .line 328
    .line 329
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    sget-object v9, LY7/K;->b:Lf8/d;

    .line 333
    .line 334
    new-instance v14, Lco/notix/wl;

    .line 335
    .line 336
    invoke-direct {v14, v6, v15, v12}, Lco/notix/wl;-><init>(Lco/notix/xl;Lco/notix/xn;LE7/d;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v9, v14, v2}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    if-ne v6, v3, :cond_e

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_e
    move-object v14, v10

    .line 347
    move-object v10, v4

    .line 348
    move-object v4, v0

    .line 349
    :goto_7
    iget v0, v11, Lkotlin/jvm/internal/m;->a:I

    .line 350
    .line 351
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    add-int/2addr v0, v6

    .line 356
    iput v0, v11, Lkotlin/jvm/internal/m;->a:I

    .line 357
    .line 358
    iget-object v0, v10, Lco/notix/lm;->c:Lco/notix/vn;

    .line 359
    .line 360
    new-instance v6, Ljava/util/ArrayList;

    .line 361
    .line 362
    const/16 v9, 0xa

    .line 363
    .line 364
    invoke-static {v4, v9}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v15

    .line 379
    if-eqz v15, :cond_f

    .line 380
    .line 381
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    check-cast v15, Lco/notix/pl;

    .line 386
    .line 387
    iget-object v15, v15, Lco/notix/pl;->a:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_f
    invoke-static {v6}, LB7/k;->K0(Ljava/util/Collection;)Ljava/util/Set;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    iput-object v14, v2, Lco/notix/km;->a:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v13, v2, Lco/notix/km;->b:Lkotlin/jvm/internal/m;

    .line 400
    .line 401
    iput-object v11, v2, Lco/notix/km;->c:Lkotlin/jvm/internal/m;

    .line 402
    .line 403
    iput-object v10, v2, Lco/notix/km;->d:Lco/notix/lm;

    .line 404
    .line 405
    iput-object v4, v2, Lco/notix/km;->e:Ljava/util/List;

    .line 406
    .line 407
    iput v7, v2, Lco/notix/km;->h:I

    .line 408
    .line 409
    invoke-virtual {v0, v6, v2}, Lco/notix/vn;->a(Ljava/util/Set;LE7/d;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-ne v0, v3, :cond_10

    .line 414
    .line 415
    :goto_9
    return-object v3

    .line 416
    :cond_10
    :goto_a
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 417
    .line 418
    .line 419
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 420
    const/16 v4, 0x1e

    .line 421
    .line 422
    if-eq v0, v4, :cond_11

    .line 423
    .line 424
    goto :goto_b

    .line 425
    :cond_11
    move v6, v4

    .line 426
    move-object v4, v10

    .line 427
    move-object v10, v14

    .line 428
    const/4 v9, 0x3

    .line 429
    goto/16 :goto_3

    .line 430
    .line 431
    :cond_12
    :goto_b
    move-object v0, v5

    .line 432
    goto :goto_d

    .line 433
    :goto_c
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    :goto_d
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const/16 v3, 0x2f

    .line 442
    .line 443
    if-nez v2, :cond_13

    .line 444
    .line 445
    check-cast v0, LA7/n;

    .line 446
    .line 447
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 448
    .line 449
    new-instance v2, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v4, "sendSavedLogs success. sent "

    .line 452
    .line 453
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    iget v4, v11, Lkotlin/jvm/internal/m;->a:I

    .line 457
    .line 458
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    iget v3, v11, Lkotlin/jvm/internal/m;->a:I

    .line 465
    .line 466
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    const-string v3, " logs"

    .line 470
    .line 471
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    :goto_e
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-virtual {v0, v2}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    goto :goto_f

    .line 482
    :cond_13
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 483
    .line 484
    new-instance v2, Ljava/lang/StringBuilder;

    .line 485
    .line 486
    const-string v4, "sendSavedLogs failure. sent "

    .line 487
    .line 488
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    iget v4, v11, Lkotlin/jvm/internal/m;->a:I

    .line 492
    .line 493
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    iget v3, v11, Lkotlin/jvm/internal/m;->a:I

    .line 500
    .line 501
    iget v4, v13, Lkotlin/jvm/internal/m;->a:I

    .line 502
    .line 503
    add-int/2addr v3, v4

    .line 504
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    goto :goto_e

    .line 508
    :goto_f
    return-object v5
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
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
