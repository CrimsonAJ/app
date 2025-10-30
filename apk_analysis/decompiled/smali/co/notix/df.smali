.class public final Lco/notix/df;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/xe;


# instance fields
.field public final a:Lco/notix/ia;

.field public final b:Lco/notix/kl;

.field public final c:Lco/notix/vk;

.field public final d:Lco/notix/y8;

.field public final e:Lco/notix/ef;

.field public final f:Lco/notix/t7;

.field public final g:Lco/notix/lf;

.field public final h:Lco/notix/mg;


# direct methods
.method public constructor <init>(Lco/notix/ia;Lco/notix/kl;Lco/notix/vk;Lco/notix/d9;Lco/notix/ef;Lco/notix/c8;Lco/notix/lf;Lco/notix/mg;)V
    .locals 1

    const-string v0, "reporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pullRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationModifierProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachingImageLoader"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationsPermissionController"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixCallbackExecutor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/df;->a:Lco/notix/ia;

    iput-object p2, p0, Lco/notix/df;->b:Lco/notix/kl;

    iput-object p3, p0, Lco/notix/df;->c:Lco/notix/vk;

    iput-object p4, p0, Lco/notix/df;->d:Lco/notix/y8;

    iput-object p5, p0, Lco/notix/df;->e:Lco/notix/ef;

    iput-object p6, p0, Lco/notix/df;->f:Lco/notix/t7;

    iput-object p7, p0, Lco/notix/df;->g:Lco/notix/lf;

    iput-object p8, p0, Lco/notix/df;->h:Lco/notix/mg;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    .line 79
    iget-object v0, p0, Lco/notix/df;->d:Lco/notix/y8;

    check-cast v0, Lco/notix/d9;

    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lco/notix/ye;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/ye;

    iget v1, v0, Lco/notix/ye;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ye;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ye;

    invoke-direct {v0, p0, p1}, Lco/notix/ye;-><init>(Lco/notix/df;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/ye;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ye;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lco/notix/ye;->b:Lco/notix/we;

    iget-object v0, v0, Lco/notix/ye;->a:Lco/notix/df;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lco/notix/ye;->a:Lco/notix/df;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    check-cast p1, LA7/j;

    .line 1
    iget-object p1, p1, LA7/j;->a:Ljava/lang/Object;

    goto :goto_1

    .line 2
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/df;->c:Lco/notix/vk;

    iput-object p0, v0, Lco/notix/ye;->a:Lco/notix/df;

    iput v4, v0, Lco/notix/ye;->e:I

    invoke-virtual {p1, v0}, Lco/notix/vk;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    invoke-static {p1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_8

    check-cast p1, Lco/notix/we;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iput-object v2, v0, Lco/notix/ye;->a:Lco/notix/df;

    iput-object p1, v0, Lco/notix/ye;->b:Lco/notix/we;

    iput v3, v0, Lco/notix/ye;->e:I

    invoke-virtual {v2, p1, v0}, Lco/notix/df;->b(Lco/notix/we;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v1, p1

    move-object p1, v0

    move-object v0, v2

    :goto_3
    check-cast p1, Lco/notix/v8;

    .line 3
    iget-object v1, v1, Lco/notix/we;->n:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 4
    iget-object v0, v0, Lco/notix/df;->a:Lco/notix/ia;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iget-object v2, v0, Lco/notix/ia;->c:LY7/z;

    new-instance v3, Lco/notix/ga;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lco/notix/ga;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    const/4 v0, 0x3

    invoke-static {v2, v4, v3, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    :cond_7
    return-object p1

    .line 6
    :cond_8
    :goto_4
    sget-object p1, Lco/notix/v8;->b:Lco/notix/v8;

    return-object p1
.end method

.method public final a(Lco/notix/we;LE7/d;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v0, p2

    instance-of v1, v0, Lco/notix/bf;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lco/notix/bf;

    iget v2, v1, Lco/notix/bf;->e:I

    const/high16 v3, -0x80000000

    and-int v6, v2, v3

    if-eqz v6, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lco/notix/bf;->e:I

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lco/notix/bf;

    invoke-direct {v1, v4, v0}, Lco/notix/bf;-><init>(Lco/notix/df;LE7/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lco/notix/bf;->c:Ljava/lang/Object;

    sget-object v7, LF7/a;->a:LF7/a;

    iget v1, v6, Lco/notix/bf;->e:I

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v1, v6, Lco/notix/bf;->b:Lco/notix/we;

    iget-object v2, v6, Lco/notix/bf;->a:Lco/notix/df;

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v6, Lco/notix/bf;->b:Lco/notix/we;

    iget-object v2, v6, Lco/notix/bf;->a:Lco/notix/df;

    :try_start_0
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    move-object v5, v1

    goto/16 :goto_9

    .line 7
    :cond_3
    iget-object v1, v6, Lco/notix/bf;->b:Lco/notix/we;

    iget-object v2, v6, Lco/notix/bf;->a:Lco/notix/df;

    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    check-cast v0, LA7/j;

    .line 8
    iget-object v0, v0, LA7/j;->a:Ljava/lang/Object;

    goto/16 :goto_6

    .line 9
    :cond_4
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    iget-object v1, v4, Lco/notix/df;->e:Lco/notix/ef;

    .line 10
    iget-object v0, v1, Lco/notix/ef;->b:Lco/notix/push/NotixNotificationModifier;

    if-eqz v0, :cond_5

    :goto_2
    move-object v3, v0

    goto :goto_5

    .line 11
    :cond_5
    iget-object v0, v1, Lco/notix/ef;->a:Lco/notix/xq;

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    sget-object v0, Lco/notix/wq;->b:Lco/notix/d9;

    .line 14
    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v0

    .line 15
    const-string v3, "NOTIX_NOTIFICATION_MODIFIER_CLASS"

    invoke-static {v0, v3}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 16
    :try_start_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type co.notix.push.NotixNotificationModifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lco/notix/push/NotixNotificationModifier;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_6

    sget-object v11, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Unable to instantiate NotixNotificationModifier. Make sure that the provided class has a public no argument constructor. "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12, v3}, Lco/notix/kd;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    :cond_6
    instance-of v3, v0, LA7/i;

    if-eqz v3, :cond_7

    move-object v0, v8

    .line 18
    :cond_7
    check-cast v0, Lco/notix/push/NotixNotificationModifier;

    goto :goto_4

    :cond_8
    move-object v0, v8

    .line 19
    :goto_4
    iput-object v0, v1, Lco/notix/ef;->b:Lco/notix/push/NotixNotificationModifier;

    goto :goto_2

    .line 20
    :goto_5
    iget-object v0, v5, Lco/notix/we;->o:Ljava/lang/String;

    if-eqz v0, :cond_1d

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_7

    .line 22
    :cond_9
    const-string v1, "{}"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    .line 23
    iget-object v1, v4, Lco/notix/df;->b:Lco/notix/kl;

    iput-object v4, v6, Lco/notix/bf;->a:Lco/notix/df;

    iput-object v5, v6, Lco/notix/bf;->b:Lco/notix/we;

    iput v2, v6, Lco/notix/bf;->e:I

    invoke-virtual {v1, v0, v6}, Lco/notix/kl;->a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_a

    goto/16 :goto_d

    :cond_a
    move-object v2, v4

    move-object v1, v5

    :goto_6
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_1c

    check-cast v0, Lco/notix/we;

    if-nez v0, :cond_b

    sget-object v0, Lco/notix/v8;->a:Lco/notix/v8;

    return-object v0

    :cond_b
    new-instance v10, Lco/notix/we;

    .line 24
    iget-object v3, v0, Lco/notix/we;->a:Ljava/lang/Integer;

    if-nez v3, :cond_c

    .line 25
    iget-object v3, v1, Lco/notix/we;->a:Ljava/lang/Integer;

    :cond_c
    move-object v11, v3

    .line 26
    iget-object v3, v0, Lco/notix/we;->b:Ljava/lang/String;

    if-nez v3, :cond_d

    .line 27
    iget-object v3, v1, Lco/notix/we;->b:Ljava/lang/String;

    :cond_d
    move-object v12, v3

    .line 28
    iget-object v3, v0, Lco/notix/we;->c:Ljava/lang/String;

    if-nez v3, :cond_e

    .line 29
    iget-object v3, v1, Lco/notix/we;->c:Ljava/lang/String;

    :cond_e
    move-object v13, v3

    .line 30
    iget-object v3, v0, Lco/notix/we;->d:Ljava/lang/String;

    if-nez v3, :cond_f

    .line 31
    iget-object v3, v1, Lco/notix/we;->d:Ljava/lang/String;

    :cond_f
    move-object v14, v3

    .line 32
    iget-object v3, v0, Lco/notix/we;->e:Ljava/lang/Integer;

    if-nez v3, :cond_10

    .line 33
    iget-object v3, v1, Lco/notix/we;->e:Ljava/lang/Integer;

    :cond_10
    move-object v15, v3

    .line 34
    iget-object v3, v0, Lco/notix/we;->f:Ljava/lang/Boolean;

    if-nez v3, :cond_11

    .line 35
    iget-object v3, v1, Lco/notix/we;->f:Ljava/lang/Boolean;

    :cond_11
    move-object/from16 v16, v3

    .line 36
    iget-object v3, v1, Lco/notix/we;->g:Ljava/lang/Boolean;

    if-nez v3, :cond_12

    .line 37
    iget-object v3, v0, Lco/notix/we;->g:Ljava/lang/Boolean;

    :cond_12
    move-object/from16 v17, v3

    .line 38
    iget-object v3, v0, Lco/notix/we;->h:Ljava/lang/Boolean;

    if-nez v3, :cond_13

    iget-object v3, v1, Lco/notix/we;->h:Ljava/lang/Boolean;

    :cond_13
    move-object/from16 v18, v3

    .line 39
    iget-object v3, v0, Lco/notix/we;->i:Ljava/lang/String;

    if-nez v3, :cond_14

    iget-object v3, v1, Lco/notix/we;->i:Ljava/lang/String;

    :cond_14
    move-object/from16 v19, v3

    .line 40
    iget-object v3, v0, Lco/notix/we;->j:Ljava/lang/String;

    if-nez v3, :cond_15

    iget-object v3, v1, Lco/notix/we;->j:Ljava/lang/String;

    :cond_15
    move-object/from16 v20, v3

    .line 41
    iget-object v3, v0, Lco/notix/we;->k:Ljava/lang/Integer;

    if-nez v3, :cond_16

    iget-object v3, v1, Lco/notix/we;->k:Ljava/lang/Integer;

    :cond_16
    move-object/from16 v21, v3

    .line 42
    iget-object v3, v0, Lco/notix/we;->l:Ljava/lang/Boolean;

    if-nez v3, :cond_17

    iget-object v3, v1, Lco/notix/we;->l:Ljava/lang/Boolean;

    :cond_17
    move-object/from16 v22, v3

    .line 43
    iget-object v3, v0, Lco/notix/we;->m:Ljava/lang/String;

    if-nez v3, :cond_18

    iget-object v3, v1, Lco/notix/we;->m:Ljava/lang/String;

    :cond_18
    move-object/from16 v23, v3

    .line 44
    iget-object v3, v0, Lco/notix/we;->n:Ljava/lang/String;

    if-nez v3, :cond_19

    iget-object v3, v1, Lco/notix/we;->n:Ljava/lang/String;

    :cond_19
    move-object/from16 v24, v3

    .line 45
    iget-object v3, v0, Lco/notix/we;->o:Ljava/lang/String;

    if-nez v3, :cond_1a

    iget-object v3, v1, Lco/notix/we;->o:Ljava/lang/String;

    :cond_1a
    move-object/from16 v25, v3

    .line 46
    iget-object v0, v0, Lco/notix/we;->p:Ljava/lang/String;

    if-nez v0, :cond_1b

    iget-object v0, v1, Lco/notix/we;->p:Ljava/lang/String;

    :cond_1b
    move-object/from16 v26, v0

    .line 47
    invoke-direct/range {v10 .. v26}, Lco/notix/we;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_1c
    sget-object v0, Lco/notix/v8;->b:Lco/notix/v8;

    return-object v0

    :cond_1d
    :goto_7
    if-eqz v3, :cond_2d

    iget-object v1, v4, Lco/notix/df;->h:Lco/notix/mg;

    :try_start_2
    new-instance v0, Lco/notix/af;

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lco/notix/af;-><init>(Lco/notix/mg;LE7/d;Lco/notix/push/NotixNotificationModifier;Lco/notix/df;Lco/notix/we;)V

    iput-object v4, v6, Lco/notix/bf;->a:Lco/notix/df;

    iput-object v5, v6, Lco/notix/bf;->b:Lco/notix/we;

    iput v10, v6, Lco/notix/bf;->e:I

    .line 48
    new-instance v1, LY7/D0;

    const-wide/16 v2, 0x3e8

    invoke-direct {v1, v2, v3, v6}, LY7/D0;-><init>(JLG7/c;)V

    invoke-static {v1, v0}, LY7/B;->x(LY7/D0;LO7/p;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v7, :cond_1e

    goto/16 :goto_d

    :cond_1e
    move-object v2, v4

    goto :goto_a

    :goto_8
    move-object v2, v4

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_8

    .line 49
    :goto_9
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v0

    :goto_a
    move-object v1, v5

    :goto_b
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_2c

    check-cast v0, Lco/notix/push/data/NotificationOverrides;

    if-nez v0, :cond_1f

    sget-object v0, Lco/notix/v8;->a:Lco/notix/v8;

    return-object v0

    :cond_1f
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getColor()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_20

    .line 50
    iget-object v3, v1, Lco/notix/we;->a:Ljava/lang/Integer;

    :cond_20
    move-object v11, v3

    .line 51
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getEvent()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_21

    .line 52
    iget-object v3, v1, Lco/notix/we;->b:Ljava/lang/String;

    :cond_21
    move-object v12, v3

    .line 53
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getIconUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_22

    .line 54
    iget-object v3, v1, Lco/notix/we;->c:Ljava/lang/String;

    :cond_22
    move-object v13, v3

    .line 55
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_23

    .line 56
    iget-object v3, v1, Lco/notix/we;->d:Ljava/lang/String;

    :cond_23
    move-object v14, v3

    .line 57
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getPriority()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_24

    .line 58
    iget-object v3, v1, Lco/notix/we;->e:Ljava/lang/Integer;

    :cond_24
    move-object v15, v3

    .line 59
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getShowBadgeIcon()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_25

    .line 60
    iget-object v3, v1, Lco/notix/we;->f:Ljava/lang/Boolean;

    :cond_25
    move-object/from16 v16, v3

    .line 61
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getShowOnlyLastNotification()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_26

    .line 62
    iget-object v3, v1, Lco/notix/we;->g:Ljava/lang/Boolean;

    :cond_26
    move-object/from16 v17, v3

    .line 63
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getShowToast()Ljava/lang/Boolean;

    move-result-object v3

    if-nez v3, :cond_27

    .line 64
    iget-object v3, v1, Lco/notix/we;->h:Ljava/lang/Boolean;

    :cond_27
    move-object/from16 v18, v3

    .line 65
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_28

    .line 66
    iget-object v3, v1, Lco/notix/we;->i:Ljava/lang/String;

    :cond_28
    move-object/from16 v19, v3

    .line 67
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getText()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_29

    .line 68
    iget-object v3, v1, Lco/notix/we;->j:Ljava/lang/String;

    :cond_29
    move-object/from16 v20, v3

    .line 69
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getImportance()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_2a

    .line 70
    iget-object v3, v1, Lco/notix/we;->k:Ljava/lang/Integer;

    :cond_2a
    move-object/from16 v21, v3

    .line 71
    invoke-virtual {v0}, Lco/notix/push/data/NotificationOverrides;->getRandomGroupId()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_2b

    .line 72
    iget-object v0, v1, Lco/notix/we;->l:Ljava/lang/Boolean;

    :cond_2b
    move-object/from16 v22, v0

    .line 73
    iget-object v0, v1, Lco/notix/we;->m:Ljava/lang/String;

    iget-object v3, v1, Lco/notix/we;->n:Ljava/lang/String;

    iget-object v5, v1, Lco/notix/we;->o:Ljava/lang/String;

    iget-object v1, v1, Lco/notix/we;->p:Ljava/lang/String;

    .line 74
    new-instance v10, Lco/notix/we;

    move-object/from16 v23, v0

    move-object/from16 v26, v1

    move-object/from16 v24, v3

    move-object/from16 v25, v5

    invoke-direct/range {v10 .. v26}, Lco/notix/we;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    .line 75
    :cond_2c
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "notification modifier error. "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lco/notix/kd;->a(Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_c

    :cond_2d
    move-object v2, v4

    move-object v10, v5

    :goto_c
    iput-object v2, v6, Lco/notix/bf;->a:Lco/notix/df;

    iput-object v10, v6, Lco/notix/bf;->b:Lco/notix/we;

    iput v9, v6, Lco/notix/bf;->e:I

    invoke-virtual {v2, v10, v6}, Lco/notix/df;->b(Lco/notix/we;LE7/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_2e

    :goto_d
    return-object v7

    :cond_2e
    move-object v1, v10

    :goto_e
    check-cast v0, Lco/notix/v8;

    sget-object v3, Lco/notix/v8;->a:Lco/notix/v8;

    if-ne v0, v3, :cond_2f

    .line 76
    iget-object v1, v1, Lco/notix/we;->n:Ljava/lang/String;

    if-eqz v1, :cond_2f

    .line 77
    iget-object v2, v2, Lco/notix/df;->a:Lco/notix/ia;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    iget-object v3, v2, Lco/notix/ia;->c:LY7/z;

    new-instance v5, Lco/notix/ha;

    invoke-direct {v5, v2, v1, v8}, Lco/notix/ha;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    invoke-static {v3, v8, v5, v9}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    :cond_2f
    return-object v0
.end method

.method public final b(Lco/notix/we;LE7/d;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    instance-of v5, v2, Lco/notix/cf;

    .line 9
    .line 10
    if-eqz v5, :cond_0

    .line 11
    .line 12
    move-object v5, v2

    .line 13
    check-cast v5, Lco/notix/cf;

    .line 14
    .line 15
    iget v6, v5, Lco/notix/cf;->m:I

    .line 16
    .line 17
    const/high16 v7, -0x80000000

    .line 18
    .line 19
    and-int v8, v6, v7

    .line 20
    .line 21
    if-eqz v8, :cond_0

    .line 22
    .line 23
    sub-int/2addr v6, v7

    .line 24
    iput v6, v5, Lco/notix/cf;->m:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v5, Lco/notix/cf;

    .line 28
    .line 29
    invoke-direct {v5, v1, v2}, Lco/notix/cf;-><init>(Lco/notix/df;LE7/d;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v2, v5, Lco/notix/cf;->k:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v6, LF7/a;->a:LF7/a;

    .line 35
    .line 36
    iget v7, v5, Lco/notix/cf;->m:I

    .line 37
    .line 38
    const/4 v11, 0x2

    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    if-eq v7, v4, :cond_2

    .line 42
    .line 43
    if-ne v7, v11, :cond_1

    .line 44
    .line 45
    iget v0, v5, Lco/notix/cf;->j:I

    .line 46
    .line 47
    iget v6, v5, Lco/notix/cf;->i:I

    .line 48
    .line 49
    iget v7, v5, Lco/notix/cf;->h:I

    .line 50
    .line 51
    iget v12, v5, Lco/notix/cf;->g:I

    .line 52
    .line 53
    iget-object v13, v5, Lco/notix/cf;->f:Landroid/os/Parcelable;

    .line 54
    .line 55
    check-cast v13, Landroid/graphics/Bitmap;

    .line 56
    .line 57
    iget-object v14, v5, Lco/notix/cf;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v14, Landroid/app/PendingIntent;

    .line 60
    .line 61
    iget-object v15, v5, Lco/notix/cf;->d:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v10, v5, Lco/notix/cf;->c:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v8, v5, Lco/notix/cf;->b:Ljava/lang/Integer;

    .line 66
    .line 67
    iget-object v5, v5, Lco/notix/cf;->a:Lco/notix/df;

    .line 68
    .line 69
    invoke-static {v2}, La/a;->A(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_c

    .line 73
    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    iget v0, v5, Lco/notix/cf;->j:I

    .line 83
    .line 84
    iget v7, v5, Lco/notix/cf;->i:I

    .line 85
    .line 86
    iget v8, v5, Lco/notix/cf;->h:I

    .line 87
    .line 88
    iget v10, v5, Lco/notix/cf;->g:I

    .line 89
    .line 90
    iget-object v12, v5, Lco/notix/cf;->f:Landroid/os/Parcelable;

    .line 91
    .line 92
    check-cast v12, Landroid/app/PendingIntent;

    .line 93
    .line 94
    iget-object v13, v5, Lco/notix/cf;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v13, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v14, v5, Lco/notix/cf;->d:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v15, v5, Lco/notix/cf;->c:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, v5, Lco/notix/cf;->b:Ljava/lang/Integer;

    .line 103
    .line 104
    iget-object v11, v5, Lco/notix/cf;->a:Lco/notix/df;

    .line 105
    .line 106
    invoke-static {v2}, La/a;->A(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v4, v6

    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_3
    invoke-static {v2}, La/a;->A(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, Lco/notix/df;->g:Lco/notix/lf;

    .line 116
    .line 117
    invoke-virtual {v2}, Lco/notix/lf;->c()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_4

    .line 122
    .line 123
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v0, v0, Lco/notix/kd;->b:Lco/notix/x8;

    .line 129
    .line 130
    const-string v2, "showNotification was called, but can\'t post notifications"

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lco/notix/x8;->a(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lco/notix/v8;->a:Lco/notix/v8;

    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_4
    iget-object v3, v0, Lco/notix/we;->a:Ljava/lang/Integer;

    .line 139
    .line 140
    iget-object v2, v0, Lco/notix/we;->b:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v7, v0, Lco/notix/we;->c:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v15, v0, Lco/notix/we;->d:Ljava/lang/String;

    .line 145
    .line 146
    iget-object v8, v0, Lco/notix/we;->f:Ljava/lang/Boolean;

    .line 147
    .line 148
    if-eqz v8, :cond_5

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    move v10, v8

    .line 155
    goto :goto_1

    .line 156
    :cond_5
    move v10, v4

    .line 157
    :goto_1
    iget-object v8, v0, Lco/notix/we;->g:Ljava/lang/Boolean;

    .line 158
    .line 159
    if-eqz v8, :cond_6

    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    goto :goto_2

    .line 166
    :cond_6
    const/4 v8, 0x0

    .line 167
    :goto_2
    iget-object v14, v0, Lco/notix/we;->i:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v13, v0, Lco/notix/we;->j:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v11, v0, Lco/notix/we;->k:Ljava/lang/Integer;

    .line 172
    .line 173
    if-eqz v11, :cond_7

    .line 174
    .line 175
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    goto :goto_3

    .line 180
    :cond_7
    const/4 v11, 0x4

    .line 181
    :goto_3
    iget-object v12, v0, Lco/notix/we;->l:Ljava/lang/Boolean;

    .line 182
    .line 183
    if-eqz v12, :cond_8

    .line 184
    .line 185
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    goto :goto_4

    .line 190
    :cond_8
    move v12, v4

    .line 191
    :goto_4
    iget-object v4, v0, Lco/notix/we;->m:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v0, v0, Lco/notix/we;->p:Ljava/lang/String;

    .line 194
    .line 195
    if-eqz v0, :cond_c

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v19

    .line 201
    if-nez v19, :cond_9

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_9
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    goto :goto_5

    .line 209
    :catchall_0
    move-exception v0

    .line 210
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    :goto_5
    instance-of v2, v0, LA7/i;

    .line 215
    .line 216
    if-eqz v2, :cond_a

    .line 217
    .line 218
    const/4 v0, 0x0

    .line 219
    :cond_a
    check-cast v0, Landroid/net/Uri;

    .line 220
    .line 221
    if-nez v0, :cond_b

    .line 222
    .line 223
    sget-object v0, Lco/notix/v8;->c:Lco/notix/v8;

    .line 224
    .line 225
    return-object v0

    .line 226
    :cond_b
    new-instance v2, Landroid/content/Intent;

    .line 227
    .line 228
    const-string v4, "android.intent.action.VIEW"

    .line 229
    .line 230
    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 234
    .line 235
    .line 236
    move-object/from16 v20, v6

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_c
    :goto_6
    new-instance v0, Landroid/content/Intent;

    .line 240
    .line 241
    invoke-virtual {v1}, Lco/notix/df;->a()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    move-object/from16 v20, v6

    .line 246
    .line 247
    const-class v6, Lco/notix/push/NotificationClickHandlerActivity;

    .line 248
    .line 249
    invoke-direct {v0, v9, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 250
    .line 251
    .line 252
    const-string v6, "click_data"

    .line 253
    .line 254
    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    .line 256
    .line 257
    const-string v4, "event"

    .line 258
    .line 259
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 260
    .line 261
    .line 262
    move-object v2, v0

    .line 263
    :goto_7
    invoke-virtual {v1}, Lco/notix/df;->a()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sget-object v4, LR7/d;->a:LR7/a;

    .line 268
    .line 269
    const v6, 0x7fffffff

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v6}, LR7/a;->f(I)I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    const/high16 v6, 0x4000000

    .line 277
    .line 278
    invoke-static {v0, v4, v2, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    const-string v2, "{\n            PendingInt\u2026E\n            )\n        }"

    .line 283
    .line 284
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    if-eqz v7, :cond_e

    .line 288
    .line 289
    iget-object v2, v1, Lco/notix/df;->f:Lco/notix/t7;

    .line 290
    .line 291
    sget-object v4, Lco/notix/no;->d:Lco/notix/no;

    .line 292
    .line 293
    iput-object v1, v5, Lco/notix/cf;->a:Lco/notix/df;

    .line 294
    .line 295
    iput-object v3, v5, Lco/notix/cf;->b:Ljava/lang/Integer;

    .line 296
    .line 297
    iput-object v15, v5, Lco/notix/cf;->c:Ljava/lang/String;

    .line 298
    .line 299
    iput-object v14, v5, Lco/notix/cf;->d:Ljava/lang/String;

    .line 300
    .line 301
    iput-object v13, v5, Lco/notix/cf;->e:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v0, v5, Lco/notix/cf;->f:Landroid/os/Parcelable;

    .line 304
    .line 305
    iput v10, v5, Lco/notix/cf;->g:I

    .line 306
    .line 307
    iput v8, v5, Lco/notix/cf;->h:I

    .line 308
    .line 309
    iput v11, v5, Lco/notix/cf;->i:I

    .line 310
    .line 311
    iput v12, v5, Lco/notix/cf;->j:I

    .line 312
    .line 313
    const/4 v6, 0x1

    .line 314
    iput v6, v5, Lco/notix/cf;->m:I

    .line 315
    .line 316
    check-cast v2, Lco/notix/c8;

    .line 317
    .line 318
    invoke-virtual {v2, v7, v4, v5}, Lco/notix/c8;->a(Ljava/lang/String;Lco/notix/no;LE7/d;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move-object/from16 v4, v20

    .line 323
    .line 324
    if-ne v2, v4, :cond_d

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_d
    move v7, v12

    .line 328
    move-object v12, v0

    .line 329
    move v0, v7

    .line 330
    move v7, v11

    .line 331
    move-object v11, v1

    .line 332
    :goto_8
    check-cast v2, Landroid/graphics/Bitmap;

    .line 333
    .line 334
    move-object v6, v13

    .line 335
    move-object v13, v2

    .line 336
    move-object v2, v6

    .line 337
    move-object v6, v12

    .line 338
    move v12, v10

    .line 339
    move-object v10, v14

    .line 340
    move-object v14, v6

    .line 341
    move v6, v7

    .line 342
    :goto_9
    move v7, v8

    .line 343
    move-object v8, v3

    .line 344
    goto :goto_a

    .line 345
    :cond_e
    move-object/from16 v4, v20

    .line 346
    .line 347
    move-object v2, v14

    .line 348
    move-object v14, v0

    .line 349
    move v0, v12

    .line 350
    move v12, v10

    .line 351
    move-object v10, v2

    .line 352
    move v6, v11

    .line 353
    move-object v2, v13

    .line 354
    const/4 v13, 0x0

    .line 355
    move-object v11, v1

    .line 356
    goto :goto_9

    .line 357
    :goto_a
    if-eqz v15, :cond_10

    .line 358
    .line 359
    iget-object v3, v11, Lco/notix/df;->f:Lco/notix/t7;

    .line 360
    .line 361
    sget-object v9, Lco/notix/no;->d:Lco/notix/no;

    .line 362
    .line 363
    iput-object v11, v5, Lco/notix/cf;->a:Lco/notix/df;

    .line 364
    .line 365
    iput-object v8, v5, Lco/notix/cf;->b:Ljava/lang/Integer;

    .line 366
    .line 367
    iput-object v10, v5, Lco/notix/cf;->c:Ljava/lang/String;

    .line 368
    .line 369
    iput-object v2, v5, Lco/notix/cf;->d:Ljava/lang/String;

    .line 370
    .line 371
    iput-object v14, v5, Lco/notix/cf;->e:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v13, v5, Lco/notix/cf;->f:Landroid/os/Parcelable;

    .line 374
    .line 375
    iput v12, v5, Lco/notix/cf;->g:I

    .line 376
    .line 377
    iput v7, v5, Lco/notix/cf;->h:I

    .line 378
    .line 379
    iput v6, v5, Lco/notix/cf;->i:I

    .line 380
    .line 381
    iput v0, v5, Lco/notix/cf;->j:I

    .line 382
    .line 383
    const/4 v1, 0x2

    .line 384
    iput v1, v5, Lco/notix/cf;->m:I

    .line 385
    .line 386
    check-cast v3, Lco/notix/c8;

    .line 387
    .line 388
    invoke-virtual {v3, v15, v9, v5}, Lco/notix/c8;->a(Ljava/lang/String;Lco/notix/no;LE7/d;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    if-ne v1, v4, :cond_f

    .line 393
    .line 394
    :goto_b
    return-object v4

    .line 395
    :cond_f
    move-object v15, v2

    .line 396
    move-object v5, v11

    .line 397
    move-object v2, v1

    .line 398
    :goto_c
    move-object v1, v2

    .line 399
    check-cast v1, Landroid/graphics/Bitmap;

    .line 400
    .line 401
    move-object v11, v5

    .line 402
    move-object v2, v15

    .line 403
    goto :goto_d

    .line 404
    :cond_10
    const/4 v1, 0x0

    .line 405
    :goto_d
    invoke-virtual {v11}, Lco/notix/df;->a()Landroid/content/Context;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    new-instance v4, LD/w;

    .line 410
    .line 411
    invoke-direct {v4, v3}, LD/w;-><init>(Landroid/content/Context;)V

    .line 412
    .line 413
    .line 414
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 415
    .line 416
    const/16 v5, 0x1a

    .line 417
    .line 418
    if-lt v3, v5, :cond_1b

    .line 419
    .line 420
    if-eqz v12, :cond_11

    .line 421
    .line 422
    const/4 v9, 0x1

    .line 423
    goto :goto_e

    .line 424
    :cond_11
    const/4 v9, 0x0

    .line 425
    :goto_e
    iget-object v12, v4, LD/w;->b:Landroid/app/NotificationManager;

    .line 426
    .line 427
    if-lt v3, v5, :cond_12

    .line 428
    .line 429
    invoke-static {v12}, LD/p;->c(Landroid/app/NotificationManager;)Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    goto :goto_f

    .line 434
    :cond_12
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 435
    .line 436
    :goto_f
    const-string v15, "notificationChannels"

    .line 437
    .line 438
    invoke-static {v3, v15}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    new-instance v15, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v20

    .line 454
    const-string v5, "it.id"

    .line 455
    .line 456
    move/from16 v21, v0

    .line 457
    .line 458
    const-string v0, "notix_news_"

    .line 459
    .line 460
    if-eqz v20, :cond_14

    .line 461
    .line 462
    move-object/from16 v20, v2

    .line 463
    .line 464
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-static {v2}, LB4/e;->f(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 469
    .line 470
    .line 471
    move-result-object v22

    .line 472
    move-object/from16 v23, v3

    .line 473
    .line 474
    invoke-static/range {v22 .. v22}, LB4/e;->k(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-static {v3, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    invoke-static {v3, v0, v5}, LW7/l;->L(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_13

    .line 487
    .line 488
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    :cond_13
    move-object/from16 v2, v20

    .line 492
    .line 493
    move/from16 v0, v21

    .line 494
    .line 495
    move-object/from16 v3, v23

    .line 496
    .line 497
    const/16 v5, 0x1a

    .line 498
    .line 499
    goto :goto_10

    .line 500
    :cond_14
    move-object/from16 v20, v2

    .line 501
    .line 502
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    const/4 v3, 0x0

    .line 507
    :goto_11
    if-ge v3, v2, :cond_16

    .line 508
    .line 509
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v22

    .line 513
    const/16 v18, 0x1

    .line 514
    .line 515
    add-int/lit8 v3, v3, 0x1

    .line 516
    .line 517
    invoke-static/range {v22 .. v22}, LB4/e;->f(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 518
    .line 519
    .line 520
    move-result-object v23

    .line 521
    move/from16 v24, v2

    .line 522
    .line 523
    invoke-static/range {v23 .. v23}, LB4/e;->a(Landroid/app/NotificationChannel;)I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    if-ne v2, v6, :cond_15

    .line 528
    .line 529
    invoke-static/range {v23 .. v23}, LB4/e;->y(Landroid/app/NotificationChannel;)Z

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    if-ne v2, v9, :cond_15

    .line 534
    .line 535
    goto :goto_12

    .line 536
    :cond_15
    move/from16 v2, v24

    .line 537
    .line 538
    goto :goto_11

    .line 539
    :cond_16
    const/16 v22, 0x0

    .line 540
    .line 541
    :goto_12
    invoke-static/range {v22 .. v22}, LB4/e;->f(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    if-eqz v2, :cond_17

    .line 546
    .line 547
    invoke-static {v2}, LB4/e;->k(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    const-string v2, "{\n            channel.id\n        }"

    .line 552
    .line 553
    invoke-static {v0, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    goto :goto_15

    .line 557
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    const/4 v9, 0x0

    .line 567
    :goto_13
    if-ge v9, v3, :cond_19

    .line 568
    .line 569
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v22

    .line 573
    const/16 v18, 0x1

    .line 574
    .line 575
    add-int/lit8 v9, v9, 0x1

    .line 576
    .line 577
    invoke-static/range {v22 .. v22}, LB4/e;->f(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 578
    .line 579
    .line 580
    move-result-object v22

    .line 581
    move/from16 v23, v3

    .line 582
    .line 583
    invoke-static/range {v22 .. v22}, LB4/e;->k(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-static {v3, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v3, v0}, LW7/d;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    invoke-static {v3}, LW7/k;->E(Ljava/lang/String;)Ljava/lang/Integer;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    if-eqz v3, :cond_18

    .line 599
    .line 600
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    :cond_18
    move/from16 v3, v23

    .line 604
    .line 605
    goto :goto_13

    .line 606
    :cond_19
    invoke-static {v2}, LB7/k;->x0(Ljava/util/Collection;)Ljava/lang/Comparable;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    check-cast v2, Ljava/lang/Integer;

    .line 611
    .line 612
    if-eqz v2, :cond_1a

    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    goto :goto_14

    .line 619
    :cond_1a
    const/4 v5, 0x0

    .line 620
    :goto_14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 621
    .line 622
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    const/16 v18, 0x1

    .line 626
    .line 627
    add-int/lit8 v5, v5, 0x1

    .line 628
    .line 629
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-static {v6, v0}, LB4/e;->c(ILjava/lang/String;)Landroid/app/NotificationChannel;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 641
    .line 642
    const/16 v5, 0x1a

    .line 643
    .line 644
    if-lt v3, v5, :cond_1c

    .line 645
    .line 646
    invoke-static {v12, v2}, LD/p;->b(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 647
    .line 648
    .line 649
    goto :goto_15

    .line 650
    :cond_1b
    move/from16 v21, v0

    .line 651
    .line 652
    move-object/from16 v20, v2

    .line 653
    .line 654
    const-string v0, ""

    .line 655
    .line 656
    :cond_1c
    :goto_15
    new-instance v2, LD/m;

    .line 657
    .line 658
    invoke-virtual {v11}, Lco/notix/df;->a()Landroid/content/Context;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    invoke-direct {v2, v3, v0}, LD/m;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    iget-object v0, v2, LD/m;->w:Landroid/app/Notification;

    .line 666
    .line 667
    invoke-virtual {v11}, Lco/notix/df;->a()Landroid/content/Context;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 676
    .line 677
    iput v3, v0, Landroid/app/Notification;->icon:I

    .line 678
    .line 679
    invoke-virtual {v2, v13}, LD/m;->d(Landroid/graphics/Bitmap;)V

    .line 680
    .line 681
    .line 682
    if-eqz v1, :cond_1d

    .line 683
    .line 684
    new-instance v3, LD/j;

    .line 685
    .line 686
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 687
    .line 688
    .line 689
    new-instance v5, Landroidx/core/graphics/drawable/IconCompat;

    .line 690
    .line 691
    const/4 v9, 0x1

    .line 692
    invoke-direct {v5, v9}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 693
    .line 694
    .line 695
    iput-object v1, v5, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 696
    .line 697
    iput-object v5, v3, LD/j;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 698
    .line 699
    const/4 v1, 0x0

    .line 700
    iput-object v1, v3, LD/j;->c:Landroidx/core/graphics/drawable/IconCompat;

    .line 701
    .line 702
    iput-boolean v9, v3, LD/j;->d:Z

    .line 703
    .line 704
    invoke-virtual {v2, v3}, LD/m;->e(LD/n;)V

    .line 705
    .line 706
    .line 707
    :cond_1d
    invoke-static {v10}, LD/m;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    iput-object v1, v2, LD/m;->e:Ljava/lang/CharSequence;

    .line 712
    .line 713
    invoke-static/range {v20 .. v20}, LD/m;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    iput-object v1, v2, LD/m;->f:Ljava/lang/CharSequence;

    .line 718
    .line 719
    const/16 v1, 0x10

    .line 720
    .line 721
    const/4 v9, 0x1

    .line 722
    invoke-virtual {v2, v1, v9}, LD/m;->c(IZ)V

    .line 723
    .line 724
    .line 725
    iput-object v14, v2, LD/m;->g:Landroid/app/PendingIntent;

    .line 726
    .line 727
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 728
    .line 729
    const/16 v5, 0x1a

    .line 730
    .line 731
    if-ge v1, v5, :cond_1e

    .line 732
    .line 733
    iput v6, v2, LD/m;->k:I

    .line 734
    .line 735
    const/4 v1, 0x3

    .line 736
    if-lt v6, v1, :cond_1e

    .line 737
    .line 738
    const/4 v1, -0x1

    .line 739
    iput v1, v0, Landroid/app/Notification;->defaults:I

    .line 740
    .line 741
    iget v1, v0, Landroid/app/Notification;->flags:I

    .line 742
    .line 743
    const/16 v18, 0x1

    .line 744
    .line 745
    or-int/lit8 v1, v1, 0x1

    .line 746
    .line 747
    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 748
    .line 749
    const/16 v17, 0x2

    .line 750
    .line 751
    invoke-static/range {v17 .. v17}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    iput-object v1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 756
    .line 757
    const/4 v1, 0x5

    .line 758
    iput v1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 759
    .line 760
    invoke-static {}, LD/l;->b()Landroid/media/AudioAttributes$Builder;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    const/4 v5, 0x4

    .line 765
    invoke-static {v3, v5}, LD/l;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-static {v3, v1}, LD/l;->d(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-static {v1}, LD/l;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    iput-object v1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 778
    .line 779
    const/4 v9, 0x1

    .line 780
    new-array v1, v9, [J

    .line 781
    .line 782
    const-wide/16 v5, 0x1f4

    .line 783
    .line 784
    const/16 v16, 0x0

    .line 785
    .line 786
    aput-wide v5, v1, v16

    .line 787
    .line 788
    iput-object v1, v0, Landroid/app/Notification;->vibrate:[J

    .line 789
    .line 790
    goto :goto_16

    .line 791
    :cond_1e
    const/16 v16, 0x0

    .line 792
    .line 793
    :goto_16
    if-eqz v8, :cond_1f

    .line 794
    .line 795
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    iput v0, v2, LD/m;->r:I

    .line 800
    .line 801
    :cond_1f
    if-eqz v21, :cond_20

    .line 802
    .line 803
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    iput-object v0, v2, LD/m;->n:Ljava/lang/String;

    .line 812
    .line 813
    :cond_20
    invoke-virtual {v2}, LD/m;->a()Landroid/app/Notification;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const-string v1, "Builder(context, channel\u2026)) }\n            .build()"

    .line 818
    .line 819
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    if-eqz v7, :cond_21

    .line 823
    .line 824
    move/from16 v3, v16

    .line 825
    .line 826
    :goto_17
    const/4 v1, 0x0

    .line 827
    goto :goto_18

    .line 828
    :cond_21
    sget-object v1, LR7/d;->a:LR7/a;

    .line 829
    .line 830
    const v6, 0x7fffffff

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v6}, LR7/a;->f(I)I

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    goto :goto_17

    .line 838
    :goto_18
    :try_start_1
    invoke-virtual {v4, v1, v3, v0}, LD/w;->a(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 839
    .line 840
    .line 841
    sget-object v0, LA7/n;->a:LA7/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 842
    .line 843
    goto :goto_19

    .line 844
    :catchall_1
    move-exception v0

    .line 845
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    :goto_19
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    if-nez v1, :cond_22

    .line 854
    .line 855
    check-cast v0, LA7/n;

    .line 856
    .line 857
    sget-object v0, Lco/notix/v8;->a:Lco/notix/v8;

    .line 858
    .line 859
    goto :goto_1a

    .line 860
    :cond_22
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 861
    .line 862
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    iget-object v0, v0, Lco/notix/kd;->b:Lco/notix/x8;

    .line 866
    .line 867
    const-string v2, "notificationManager.notify exception"

    .line 868
    .line 869
    invoke-virtual {v0, v2, v1}, Lco/notix/x8;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 870
    .line 871
    .line 872
    sget-object v0, Lco/notix/v8;->c:Lco/notix/v8;

    .line 873
    .line 874
    :goto_1a
    return-object v0
.end method
