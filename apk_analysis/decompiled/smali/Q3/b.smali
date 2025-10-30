.class public final LQ3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/x;
.implements LN3/e0;


# static fields
.field public static final x:Ljava/util/regex/Pattern;

.field public static final y:Ljava/util/regex/Pattern;


# instance fields
.field public final a:I

.field public final b:Lo1/f;

.field public final c:Lk4/W;

.field public final d:Ln3/o;

.field public final e:Le1/q;

.field public final f:Lcom/google/firebase/messaging/s;

.field public final g:J

.field public final h:Lk4/N;

.field public final i:Lk4/q;

.field public final j:LN3/n0;

.field public final k:[LQ3/a;

.field public final l:LF5/e;

.field public final m:LQ3/p;

.field public final n:Ljava/util/IdentityHashMap;

.field public final o:LN3/G;

.field public final p:Ln3/l;

.field public q:LN3/w;

.field public r:[LP3/g;

.field public s:[LQ3/m;

.field public t:Lb7/c;

.field public u:LR3/c;

.field public v:I

.field public w:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CC([1-4])=(.+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LQ3/b;->x:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LQ3/b;->y:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
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
.end method

.method public constructor <init>(ILR3/c;Lcom/google/firebase/messaging/s;ILo1/f;Lk4/W;Ln3/o;Ln3/l;Le1/q;LN3/G;JLk4/N;Lk4/q;LF5/e;LQ3/f;Lk3/l;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v4, p14

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v7, p1

    .line 2
    iput v7, v0, LQ3/b;->a:I

    .line 3
    iput-object v1, v0, LQ3/b;->u:LR3/c;

    move-object/from16 v7, p3

    .line 4
    iput-object v7, v0, LQ3/b;->f:Lcom/google/firebase/messaging/s;

    .line 5
    iput v2, v0, LQ3/b;->v:I

    move-object/from16 v7, p5

    .line 6
    iput-object v7, v0, LQ3/b;->b:Lo1/f;

    move-object/from16 v7, p6

    .line 7
    iput-object v7, v0, LQ3/b;->c:Lk4/W;

    .line 8
    iput-object v3, v0, LQ3/b;->d:Ln3/o;

    move-object/from16 v7, p8

    .line 9
    iput-object v7, v0, LQ3/b;->p:Ln3/l;

    move-object/from16 v7, p9

    .line 10
    iput-object v7, v0, LQ3/b;->e:Le1/q;

    move-object/from16 v7, p10

    .line 11
    iput-object v7, v0, LQ3/b;->o:LN3/G;

    move-wide/from16 v7, p11

    .line 12
    iput-wide v7, v0, LQ3/b;->g:J

    move-object/from16 v7, p13

    .line 13
    iput-object v7, v0, LQ3/b;->h:Lk4/N;

    .line 14
    iput-object v4, v0, LQ3/b;->i:Lk4/q;

    move-object/from16 v7, p15

    .line 15
    iput-object v7, v0, LQ3/b;->l:LF5/e;

    .line 16
    new-instance v8, LQ3/p;

    move-object/from16 v9, p16

    invoke-direct {v8, v1, v9, v4}, LQ3/p;-><init>(LR3/c;LQ3/f;Lk4/q;)V

    iput-object v8, v0, LQ3/b;->m:LQ3/p;

    .line 17
    new-array v4, v5, [LP3/g;

    .line 18
    iput-object v4, v0, LQ3/b;->r:[LP3/g;

    .line 19
    new-array v4, v5, [LQ3/m;

    iput-object v4, v0, LQ3/b;->s:[LQ3/m;

    .line 20
    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v4, v0, LQ3/b;->n:Ljava/util/IdentityHashMap;

    .line 21
    iget-object v4, v0, LQ3/b;->r:[LP3/g;

    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v7, Lb7/c;

    const/16 v8, 0xb

    invoke-direct {v7, v8, v4}, Lb7/c;-><init>(ILjava/lang/Object;)V

    .line 24
    iput-object v7, v0, LQ3/b;->t:Lb7/c;

    .line 25
    invoke-virtual {v1, v2}, LR3/c;->b(I)LR3/h;

    move-result-object v1

    .line 26
    iget-object v2, v1, LR3/h;->d:Ljava/util/List;

    iput-object v2, v0, LQ3/b;->w:Ljava/util/List;

    .line 27
    iget-object v1, v1, LR3/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    .line 28
    new-instance v7, Landroid/util/SparseIntArray;

    invoke-direct {v7, v4}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 29
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    new-instance v9, Landroid/util/SparseArray;

    invoke-direct {v9, v4}, Landroid/util/SparseArray;-><init>(I)V

    move v10, v5

    :goto_0
    if-ge v10, v4, :cond_0

    .line 31
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LR3/a;

    iget v11, v11, LR3/a;->a:I

    invoke-virtual {v7, v11, v10}, Landroid/util/SparseIntArray;->put(II)V

    .line 32
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    invoke-virtual {v9, v10, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/2addr v10, v6

    goto :goto_0

    :cond_0
    move v10, v5

    :goto_1
    const/4 v11, -0x1

    if-ge v10, v4, :cond_6

    .line 36
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LR3/a;

    .line 37
    iget-object v13, v12, LR3/a;->e:Ljava/util/List;

    .line 38
    const-string v14, "http://dashif.org/guidelines/trickmode"

    invoke-static {v14, v13}, LQ3/b;->b(Ljava/lang/String;Ljava/util/List;)LR3/f;

    move-result-object v13

    .line 39
    iget-object v12, v12, LR3/a;->f:Ljava/util/List;

    if-nez v13, :cond_1

    .line 40
    invoke-static {v14, v12}, LQ3/b;->b(Ljava/lang/String;Ljava/util/List;)LR3/f;

    move-result-object v13

    :cond_1
    if-eqz v13, :cond_2

    .line 41
    iget-object v13, v13, LR3/f;->b:Ljava/lang/String;

    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    .line 42
    invoke-virtual {v7, v13, v11}, Landroid/util/SparseIntArray;->get(II)I

    move-result v13

    if-eq v13, v11, :cond_2

    goto :goto_2

    :cond_2
    move v13, v10

    :goto_2
    if-ne v13, v10, :cond_4

    .line 43
    const-string v14, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-static {v14, v12}, LQ3/b;->b(Ljava/lang/String;Ljava/util/List;)LR3/f;

    move-result-object v12

    if-eqz v12, :cond_4

    .line 44
    sget v14, Ll4/y;->a:I

    .line 45
    iget-object v12, v12, LR3/f;->b:Ljava/lang/String;

    const-string v14, ","

    invoke-virtual {v12, v14, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    .line 46
    array-length v14, v12

    move v15, v5

    :goto_3
    if-ge v15, v14, :cond_4

    aget-object v16, v12, v15

    move/from16 p17, v6

    .line 47
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 48
    invoke-virtual {v7, v6, v11}, Landroid/util/SparseIntArray;->get(II)I

    move-result v6

    if-eq v6, v11, :cond_3

    .line 49
    invoke-static {v13, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v13, v6

    :cond_3
    add-int/lit8 v15, v15, 0x1

    move/from16 v6, p17

    goto :goto_3

    :cond_4
    move/from16 p17, v6

    if-eq v13, v10, :cond_5

    .line 50
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 51
    invoke-virtual {v9, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    .line 52
    invoke-interface {v11, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 53
    invoke-virtual {v9, v10, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 54
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v10, v10, 0x1

    move/from16 v6, p17

    goto :goto_1

    :cond_6
    move/from16 p17, v6

    .line 55
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v6, v4, [[I

    move v7, v5

    :goto_4
    if-ge v7, v4, :cond_7

    .line 56
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-static {v9}, Lv4/e;->U(Ljava/util/Collection;)[I

    move-result-object v9

    aput-object v9, v6, v7

    .line 57
    invoke-static {v9}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 58
    :cond_7
    new-array v7, v4, [Z

    .line 59
    new-array v8, v4, [[Lj3/M;

    move v9, v5

    move v10, v9

    :goto_5
    if-ge v9, v4, :cond_10

    .line 60
    aget-object v12, v6, v9

    .line 61
    array-length v13, v12

    move v14, v5

    :goto_6
    if-ge v14, v13, :cond_a

    aget v15, v12, v14

    .line 62
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LR3/a;

    iget-object v15, v15, LR3/a;->c:Ljava/util/List;

    move v11, v5

    .line 63
    :goto_7
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v5

    if-ge v11, v5, :cond_9

    .line 64
    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LR3/m;

    .line 65
    iget-object v5, v5, LR3/m;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_8

    .line 66
    aput-boolean p17, v7, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_8
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_9
    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x0

    const/4 v11, -0x1

    goto :goto_6

    .line 67
    :cond_a
    :goto_8
    aget-object v5, v6, v9

    .line 68
    array-length v11, v5

    const/4 v12, 0x0

    :goto_9
    if-ge v12, v11, :cond_e

    aget v13, v5, v12

    .line 69
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LR3/a;

    .line 70
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LR3/a;

    iget-object v13, v13, LR3/a;->d:Ljava/util/List;

    move-object/from16 p2, v5

    const/4 v15, 0x0

    .line 71
    :goto_a
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    if-ge v15, v5, :cond_d

    .line 72
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LR3/f;

    move-object/from16 p3, v6

    .line 73
    iget-object v6, v5, LR3/f;->a:Ljava/lang/String;

    move-object/from16 p4, v7

    const-string v7, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 74
    new-instance v6, Lj3/L;

    invoke-direct {v6}, Lj3/L;-><init>()V

    .line 75
    const-string v7, "application/cea-608"

    iput-object v7, v6, Lj3/L;->k:Ljava/lang/String;

    .line 76
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget v11, v14, LR3/a;->a:I

    const-string v12, ":cea608"

    .line 77
    invoke-static {v7, v11, v12}, Lu0/z;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 78
    iput-object v7, v6, Lj3/L;->a:Ljava/lang/String;

    .line 79
    new-instance v7, Lj3/M;

    invoke-direct {v7, v6}, Lj3/M;-><init>(Lj3/L;)V

    .line 80
    sget-object v6, LQ3/b;->x:Ljava/util/regex/Pattern;

    invoke-static {v5, v6, v7}, LQ3/b;->e(LR3/f;Ljava/util/regex/Pattern;Lj3/M;)[Lj3/M;

    move-result-object v5

    goto :goto_b

    .line 81
    :cond_b
    const-string v6, "urn:scte:dash:cc:cea-708:2015"

    iget-object v7, v5, LR3/f;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 82
    new-instance v6, Lj3/L;

    invoke-direct {v6}, Lj3/L;-><init>()V

    .line 83
    const-string v7, "application/cea-708"

    iput-object v7, v6, Lj3/L;->k:Ljava/lang/String;

    .line 84
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget v11, v14, LR3/a;->a:I

    const-string v12, ":cea708"

    .line 85
    invoke-static {v7, v11, v12}, Lu0/z;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 86
    iput-object v7, v6, Lj3/L;->a:Ljava/lang/String;

    .line 87
    new-instance v7, Lj3/M;

    invoke-direct {v7, v6}, Lj3/M;-><init>(Lj3/L;)V

    .line 88
    sget-object v6, LQ3/b;->y:Ljava/util/regex/Pattern;

    invoke-static {v5, v6, v7}, LQ3/b;->e(LR3/f;Ljava/util/regex/Pattern;Lj3/M;)[Lj3/M;

    move-result-object v5

    goto :goto_b

    :cond_c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    goto :goto_a

    :cond_d
    move-object/from16 p3, v6

    move-object/from16 p4, v7

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v5, p2

    goto/16 :goto_9

    :cond_e
    move-object/from16 p3, v6

    move-object/from16 p4, v7

    const/4 v5, 0x0

    .line 89
    new-array v6, v5, [Lj3/M;

    move-object v5, v6

    .line 90
    :goto_b
    aput-object v5, v8, v9

    .line 91
    array-length v5, v5

    if-eqz v5, :cond_f

    add-int/lit8 v10, v10, 0x1

    :cond_f
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    const/4 v5, 0x0

    const/4 v11, -0x1

    goto/16 :goto_5

    :cond_10
    move-object/from16 p3, v6

    move-object/from16 p4, v7

    add-int/2addr v10, v4

    .line 92
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v5, v10

    .line 93
    new-array v6, v5, [LN3/m0;

    .line 94
    new-array v5, v5, [LQ3/a;

    const/4 v7, 0x0

    const/4 v9, 0x0

    .line 95
    :goto_c
    const-string v10, "application/x-emsg"

    if-ge v7, v4, :cond_18

    .line 96
    aget-object v11, p3, v7

    .line 97
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 98
    array-length v13, v11

    const/4 v14, 0x0

    :goto_d
    if-ge v14, v13, :cond_11

    aget v15, v11, v14

    .line 99
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LR3/a;

    iget-object v15, v15, LR3/a;->c:Ljava/util/List;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_d

    .line 100
    :cond_11
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v13

    new-array v14, v13, [Lj3/M;

    const/4 v15, 0x0

    :goto_e
    if-ge v15, v13, :cond_12

    .line 101
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 p2, v4

    move-object/from16 v4, v17

    check-cast v4, LR3/m;

    iget-object v4, v4, LR3/m;->a:Lj3/M;

    move-object/from16 v17, v8

    .line 102
    invoke-interface {v3, v4}, Ln3/o;->h(Lj3/M;)I

    move-result v8

    .line 103
    invoke-virtual {v4}, Lj3/M;->a()Lj3/L;

    move-result-object v4

    .line 104
    iput v8, v4, Lj3/L;->D:I

    .line 105
    new-instance v8, Lj3/M;

    invoke-direct {v8, v4}, Lj3/M;-><init>(Lj3/L;)V

    .line 106
    aput-object v8, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, p2

    move-object/from16 v8, v17

    goto :goto_e

    :cond_12
    move/from16 p2, v4

    move-object/from16 v17, v8

    const/16 v16, 0x0

    .line 107
    aget v4, v11, v16

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR3/a;

    .line 108
    iget v8, v4, LR3/a;->a:I

    const/4 v12, -0x1

    if-eq v8, v12, :cond_13

    .line 109
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_f

    .line 110
    :cond_13
    const-string v8, "unset:"

    .line 111
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_f
    add-int/lit8 v12, v9, 0x1

    .line 112
    aget-boolean v13, p4, v7

    if-eqz v13, :cond_14

    add-int/lit8 v13, v9, 0x2

    goto :goto_10

    :cond_14
    move v13, v12

    const/4 v12, -0x1

    .line 113
    :goto_10
    aget-object v15, v17, v7

    array-length v15, v15

    if-eqz v15, :cond_15

    add-int/lit8 v15, v13, 0x1

    :goto_11
    move-object/from16 p5, v1

    goto :goto_12

    :cond_15
    move v15, v13

    const/4 v13, -0x1

    goto :goto_11

    .line 114
    :goto_12
    new-instance v1, LN3/m0;

    invoke-direct {v1, v8, v14}, LN3/m0;-><init>(Ljava/lang/String;[Lj3/M;)V

    aput-object v1, v6, v9

    .line 115
    new-instance v1, LQ3/a;

    const/4 v14, 0x0

    const/16 v18, -0x1

    iget v4, v4, LR3/a;->b:I

    move-object/from16 p8, v1

    move/from16 p9, v4

    move/from16 p12, v9

    move-object/from16 p11, v11

    move/from16 p13, v12

    move/from16 p14, v13

    move/from16 p10, v14

    move/from16 p15, v18

    invoke-direct/range {p8 .. p15}, LQ3/a;-><init>(II[IIIII)V

    move-object/from16 v9, p8

    move-object/from16 v4, p11

    move/from16 v1, p12

    .line 116
    aput-object v9, v5, v1

    const/4 v9, -0x1

    if-eq v12, v9, :cond_16

    .line 117
    const-string v9, ":emsg"

    .line 118
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/measurement/k1;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 119
    new-instance v11, Lj3/L;

    invoke-direct {v11}, Lj3/L;-><init>()V

    .line 120
    iput-object v9, v11, Lj3/L;->a:Ljava/lang/String;

    .line 121
    iput-object v10, v11, Lj3/L;->k:Ljava/lang/String;

    .line 122
    new-instance v10, Lj3/M;

    invoke-direct {v10, v11}, Lj3/M;-><init>(Lj3/L;)V

    .line 123
    new-instance v11, LN3/m0;

    move/from16 v14, p17

    move/from16 p12, v1

    new-array v1, v14, [Lj3/M;

    const/16 v16, 0x0

    aput-object v10, v1, v16

    invoke-direct {v11, v9, v1}, LN3/m0;-><init>(Ljava/lang/String;[Lj3/M;)V

    aput-object v11, v6, v12

    .line 124
    new-instance v1, LQ3/a;

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, 0x5

    const/4 v14, 0x1

    const/16 v18, -0x1

    move-object/from16 p8, v1

    move-object/from16 p11, v4

    move/from16 p14, v9

    move/from16 p15, v10

    move/from16 p9, v11

    move/from16 p10, v14

    move/from16 p13, v18

    invoke-direct/range {p8 .. p15}, LQ3/a;-><init>(II[IIIII)V

    move-object/from16 v9, p8

    move/from16 v1, p12

    .line 125
    aput-object v9, v5, v12

    const/4 v9, -0x1

    :cond_16
    if-eq v13, v9, :cond_17

    .line 126
    const-string v10, ":cc"

    .line 127
    invoke-static {v8, v10}, Lcom/google/android/gms/internal/measurement/k1;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 128
    new-instance v10, LN3/m0;

    aget-object v11, v17, v7

    invoke-direct {v10, v8, v11}, LN3/m0;-><init>(Ljava/lang/String;[Lj3/M;)V

    aput-object v10, v6, v13

    .line 129
    new-instance v8, LQ3/a;

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x3

    const/4 v14, 0x1

    const/16 v18, -0x1

    move/from16 p12, v1

    move-object/from16 p11, v4

    move-object/from16 p8, v8

    move/from16 p14, v10

    move/from16 p15, v11

    move/from16 p9, v12

    move/from16 p10, v14

    move/from16 p13, v18

    invoke-direct/range {p8 .. p15}, LQ3/a;-><init>(II[IIIII)V

    move-object/from16 v1, p8

    .line 130
    aput-object v1, v5, v13

    :cond_17
    const/4 v14, 0x1

    add-int/2addr v7, v14

    move/from16 v4, p2

    move-object/from16 v1, p5

    move/from16 p17, v14

    move v9, v15

    move-object/from16 v8, v17

    goto/16 :goto_c

    :cond_18
    move v1, v9

    const/4 v1, 0x0

    .line 131
    :goto_13
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_19

    .line 132
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR3/g;

    .line 133
    new-instance v4, Lj3/L;

    invoke-direct {v4}, Lj3/L;-><init>()V

    .line 134
    invoke-virtual {v3}, LR3/g;->a()Ljava/lang/String;

    move-result-object v7

    .line 135
    iput-object v7, v4, Lj3/L;->a:Ljava/lang/String;

    .line 136
    iput-object v10, v4, Lj3/L;->k:Ljava/lang/String;

    .line 137
    new-instance v7, Lj3/M;

    invoke-direct {v7, v4}, Lj3/M;-><init>(Lj3/L;)V

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, LR3/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 139
    new-instance v4, LN3/m0;

    const/4 v14, 0x1

    new-array v8, v14, [Lj3/M;

    const/4 v11, 0x0

    aput-object v7, v8, v11

    invoke-direct {v4, v3, v8}, LN3/m0;-><init>(Ljava/lang/String;[Lj3/M;)V

    aput-object v4, v6, v9

    add-int/lit8 v3, v9, 0x1

    .line 140
    new-instance v4, LQ3/a;

    new-array v7, v11, [I

    const/4 v8, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x5

    const/4 v14, 0x2

    const/4 v15, -0x1

    move/from16 p13, v1

    move-object/from16 p6, v4

    move-object/from16 p9, v7

    move/from16 p11, v8

    move/from16 p12, v12

    move/from16 p7, v13

    move/from16 p8, v14

    move/from16 p10, v15

    invoke-direct/range {p6 .. p13}, LQ3/a;-><init>(II[IIIII)V

    move-object/from16 v1, p6

    move/from16 v16, p13

    .line 141
    aput-object v1, v5, v9

    const/4 v14, 0x1

    add-int/lit8 v1, v16, 0x1

    move v9, v3

    goto :goto_13

    .line 142
    :cond_19
    new-instance v1, LN3/n0;

    invoke-direct {v1, v6}, LN3/n0;-><init>([LN3/m0;)V

    invoke-static {v1, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 143
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, LN3/n0;

    iput-object v2, v0, LQ3/b;->j:LN3/n0;

    .line 144
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [LQ3/a;

    iput-object v1, v0, LQ3/b;->k:[LQ3/a;

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/util/List;)LR3/f;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LR3/f;

    .line 13
    .line 14
    iget-object v2, v1, LR3/f;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method public static e(LR3/f;Ljava/util/regex/Pattern;Lj3/M;)[Lj3/M;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object p0, p0, LR3/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-array p0, v1, [Lj3/M;

    .line 8
    .line 9
    aput-object p2, p0, v0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget v2, Ll4/y;->a:I

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    const-string v3, ";"

    .line 16
    .line 17
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    array-length v2, p0

    .line 22
    new-array v2, v2, [Lj3/M;

    .line 23
    .line 24
    move v3, v0

    .line 25
    :goto_0
    array-length v4, p0

    .line 26
    if-ge v3, v4, :cond_2

    .line 27
    .line 28
    aget-object v4, p0, v3

    .line 29
    .line 30
    invoke-virtual {p1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    new-array p0, v1, [Lj3/M;

    .line 41
    .line 42
    aput-object p2, p0, v0

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p2}, Lj3/M;->a()Lj3/L;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v7, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    iget-object v8, p2, Lj3/M;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v8, ":"

    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iput-object v7, v6, Lj3/L;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput v5, v6, Lj3/L;->C:I

    .line 82
    .line 83
    const/4 v5, 0x2

    .line 84
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iput-object v4, v6, Lj3/L;->c:Ljava/lang/String;

    .line 89
    .line 90
    new-instance v4, Lj3/M;

    .line 91
    .line 92
    invoke-direct {v4, v6}, Lj3/M;-><init>(Lj3/L;)V

    .line 93
    .line 94
    .line 95
    aput-object v4, v2, v3

    .line 96
    .line 97
    add-int/2addr v3, v1

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    return-object v2
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
.end method


# virtual methods
.method public final B(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->t:Lb7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lb7/c;->B(J)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->t:Lb7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb7/c;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final c(JLj3/x0;)J
    .locals 6

    .line 1
    iget-object v0, p0, LQ3/b;->r:[LP3/g;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, LP3/g;->a:I

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    iget-object v0, v3, LP3/g;->e:LP3/h;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, LP3/h;->c(JLj3/x0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-wide p1
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

.method public final d([II)I
    .locals 4

    .line 1
    aget p2, p1, p2

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v1, p0, LQ3/b;->k:[LQ3/a;

    .line 8
    .line 9
    aget-object p2, v1, p2

    .line 10
    .line 11
    iget p2, p2, LQ3/a;->e:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    array-length v3, p1

    .line 15
    if-ge v2, v3, :cond_2

    .line 16
    .line 17
    aget v3, p1, v2

    .line 18
    .line 19
    if-ne v3, p2, :cond_1

    .line 20
    .line 21
    aget-object v3, v1, v3

    .line 22
    .line 23
    iget v3, v3, LQ3/a;->c:I

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    return v0
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

.method public final h()J
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/b;->t:Lb7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb7/c;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public final k()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
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
.end method

.method public final l()LN3/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->j:LN3/n0;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final o(LN3/w;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/b;->q:LN3/w;

    .line 2
    .line 3
    invoke-interface {p1, p0}, LN3/w;->C(LN3/x;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final p()J
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/b;->t:Lb7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb7/c;->p()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->h:Lk4/N;

    .line 2
    .line 3
    invoke-interface {v0}, Lk4/N;->b()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final v(LN3/f0;)V
    .locals 0

    .line 1
    iget-object p1, p0, LQ3/b;->q:LN3/w;

    .line 2
    .line 3
    invoke-interface {p1, p0}, LN3/e0;->v(LN3/f0;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final w(J)J
    .locals 6

    .line 1
    iget-object v0, p0, LQ3/b;->r:[LP3/g;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2}, LP3/g;->C(J)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LQ3/b;->s:[LQ3/m;

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    :goto_1
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    iget-object v4, v3, LQ3/m;->c:[J

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v4, p1, p2, v5}, Ll4/y;->b([JJZ)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iput v4, v3, LQ3/m;->g:I

    .line 31
    .line 32
    iget-boolean v5, v3, LQ3/m;->d:Z

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v5, v3, LQ3/m;->c:[J

    .line 37
    .line 38
    array-length v5, v5

    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    move-wide v4, p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    :goto_2
    iput-wide v4, v3, LQ3/m;->h:J

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-wide p1
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

.method public final x(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LQ3/b;->r:[LP3/g;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, LP3/g;->x(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
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

.method public final y([Li4/q;[Z[LN3/d0;[ZJ)J
    .locals 34

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    array-length v0, v13

    .line 6
    new-array v15, v0, [I

    .line 7
    .line 8
    const/16 v16, 0x0

    .line 9
    .line 10
    move/from16 v0, v16

    .line 11
    .line 12
    :goto_0
    array-length v1, v13

    .line 13
    const/4 v2, -0x1

    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    aget-object v1, v13, v0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v2, v5, LQ3/b;->j:LN3/n0;

    .line 21
    .line 22
    invoke-interface {v1}, Li4/q;->l()LN3/m0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v2, v1}, LN3/n0;->b(LN3/m0;)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    aput v1, v15, v0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    aput v2, v15, v0

    .line 34
    .line 35
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move/from16 v0, v16

    .line 39
    .line 40
    :goto_2
    array-length v1, v13

    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    if-ge v0, v1, :cond_6

    .line 44
    .line 45
    aget-object v1, v13, v0

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    aget-boolean v1, p2, v0

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    :cond_2
    aget-object v1, p3, v0

    .line 54
    .line 55
    instance-of v3, v1, LP3/g;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    check-cast v1, LP3/g;

    .line 60
    .line 61
    invoke-virtual {v1, v5}, LP3/g;->A(LQ3/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    instance-of v3, v1, LP3/f;

    .line 66
    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    check-cast v1, LP3/f;

    .line 70
    .line 71
    iget-object v3, v1, LP3/f;->e:LP3/g;

    .line 72
    .line 73
    iget-object v4, v3, LP3/g;->d:[Z

    .line 74
    .line 75
    iget v1, v1, LP3/f;->c:I

    .line 76
    .line 77
    aget-boolean v4, v4, v1

    .line 78
    .line 79
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v3, v3, LP3/g;->d:[Z

    .line 83
    .line 84
    aput-boolean v16, v3, v1

    .line 85
    .line 86
    :cond_4
    :goto_3
    aput-object v17, p3, v0

    .line 87
    .line 88
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    move/from16 v0, v16

    .line 92
    .line 93
    :goto_4
    array-length v1, v13

    .line 94
    const/4 v3, 0x1

    .line 95
    if-ge v0, v1, :cond_c

    .line 96
    .line 97
    aget-object v1, p3, v0

    .line 98
    .line 99
    instance-of v4, v1, LN3/n;

    .line 100
    .line 101
    if-nez v4, :cond_7

    .line 102
    .line 103
    instance-of v1, v1, LP3/f;

    .line 104
    .line 105
    if-eqz v1, :cond_b

    .line 106
    .line 107
    :cond_7
    invoke-virtual {v5, v15, v0}, LQ3/b;->d([II)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-ne v1, v2, :cond_8

    .line 112
    .line 113
    aget-object v1, p3, v0

    .line 114
    .line 115
    instance-of v1, v1, LN3/n;

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    aget-object v4, p3, v0

    .line 119
    .line 120
    instance-of v6, v4, LP3/f;

    .line 121
    .line 122
    if-eqz v6, :cond_9

    .line 123
    .line 124
    check-cast v4, LP3/f;

    .line 125
    .line 126
    iget-object v4, v4, LP3/f;->a:LP3/g;

    .line 127
    .line 128
    aget-object v1, p3, v1

    .line 129
    .line 130
    if-ne v4, v1, :cond_9

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_9
    move/from16 v3, v16

    .line 134
    .line 135
    :goto_5
    move v1, v3

    .line 136
    :goto_6
    if-nez v1, :cond_b

    .line 137
    .line 138
    aget-object v1, p3, v0

    .line 139
    .line 140
    instance-of v3, v1, LP3/f;

    .line 141
    .line 142
    if-eqz v3, :cond_a

    .line 143
    .line 144
    check-cast v1, LP3/f;

    .line 145
    .line 146
    iget-object v3, v1, LP3/f;->e:LP3/g;

    .line 147
    .line 148
    iget-object v4, v3, LP3/g;->d:[Z

    .line 149
    .line 150
    iget v1, v1, LP3/f;->c:I

    .line 151
    .line 152
    aget-boolean v4, v4, v1

    .line 153
    .line 154
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v3, LP3/g;->d:[Z

    .line 158
    .line 159
    aput-boolean v16, v3, v1

    .line 160
    .line 161
    :cond_a
    aput-object v17, p3, v0

    .line 162
    .line 163
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_c
    move/from16 v0, v16

    .line 167
    .line 168
    :goto_7
    array-length v1, v13

    .line 169
    if-ge v0, v1, :cond_19

    .line 170
    .line 171
    aget-object v24, v13, v0

    .line 172
    .line 173
    if-nez v24, :cond_d

    .line 174
    .line 175
    move-wide/from16 v7, p5

    .line 176
    .line 177
    move/from16 v33, v0

    .line 178
    .line 179
    goto/16 :goto_10

    .line 180
    .line 181
    :cond_d
    aget-object v1, p3, v0

    .line 182
    .line 183
    if-nez v1, :cond_17

    .line 184
    .line 185
    aput-boolean v3, p4, v0

    .line 186
    .line 187
    aget v1, v15, v0

    .line 188
    .line 189
    iget-object v4, v5, LQ3/b;->k:[LQ3/a;

    .line 190
    .line 191
    aget-object v1, v4, v1

    .line 192
    .line 193
    iget v4, v1, LQ3/a;->c:I

    .line 194
    .line 195
    if-nez v4, :cond_16

    .line 196
    .line 197
    iget v4, v1, LQ3/a;->f:I

    .line 198
    .line 199
    if-eq v4, v2, :cond_e

    .line 200
    .line 201
    move/from16 v29, v3

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_e
    move/from16 v29, v16

    .line 205
    .line 206
    :goto_8
    if-eqz v29, :cond_f

    .line 207
    .line 208
    iget-object v6, v5, LQ3/b;->j:LN3/n0;

    .line 209
    .line 210
    invoke-virtual {v6, v4}, LN3/n0;->a(I)LN3/m0;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    move v6, v3

    .line 215
    goto :goto_9

    .line 216
    :cond_f
    move/from16 v6, v16

    .line 217
    .line 218
    move-object/from16 v4, v17

    .line 219
    .line 220
    :goto_9
    iget v7, v1, LQ3/a;->g:I

    .line 221
    .line 222
    if-eq v7, v2, :cond_10

    .line 223
    .line 224
    move v8, v3

    .line 225
    goto :goto_a

    .line 226
    :cond_10
    move/from16 v8, v16

    .line 227
    .line 228
    :goto_a
    if-eqz v8, :cond_11

    .line 229
    .line 230
    iget-object v9, v5, LQ3/b;->j:LN3/n0;

    .line 231
    .line 232
    invoke-virtual {v9, v7}, LN3/n0;->a(I)LN3/m0;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    iget v9, v7, LN3/m0;->a:I

    .line 237
    .line 238
    add-int/2addr v6, v9

    .line 239
    :goto_b
    move v9, v3

    .line 240
    goto :goto_c

    .line 241
    :cond_11
    move-object/from16 v7, v17

    .line 242
    .line 243
    goto :goto_b

    .line 244
    :goto_c
    new-array v3, v6, [Lj3/M;

    .line 245
    .line 246
    new-array v6, v6, [I

    .line 247
    .line 248
    if-eqz v29, :cond_12

    .line 249
    .line 250
    iget-object v4, v4, LN3/m0;->d:[Lj3/M;

    .line 251
    .line 252
    aget-object v4, v4, v16

    .line 253
    .line 254
    aput-object v4, v3, v16

    .line 255
    .line 256
    const/4 v4, 0x5

    .line 257
    aput v4, v6, v16

    .line 258
    .line 259
    move v4, v9

    .line 260
    goto :goto_d

    .line 261
    :cond_12
    move/from16 v4, v16

    .line 262
    .line 263
    :goto_d
    new-instance v10, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    if-eqz v8, :cond_13

    .line 269
    .line 270
    move/from16 v8, v16

    .line 271
    .line 272
    :goto_e
    iget v11, v7, LN3/m0;->a:I

    .line 273
    .line 274
    if-ge v8, v11, :cond_13

    .line 275
    .line 276
    iget-object v11, v7, LN3/m0;->d:[Lj3/M;

    .line 277
    .line 278
    aget-object v11, v11, v8

    .line 279
    .line 280
    aput-object v11, v3, v4

    .line 281
    .line 282
    const/4 v12, 0x3

    .line 283
    aput v12, v6, v4

    .line 284
    .line 285
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    add-int/2addr v4, v9

    .line 289
    add-int/lit8 v8, v8, 0x1

    .line 290
    .line 291
    goto :goto_e

    .line 292
    :cond_13
    iget-object v4, v5, LQ3/b;->u:LR3/c;

    .line 293
    .line 294
    iget-boolean v4, v4, LR3/c;->d:Z

    .line 295
    .line 296
    if-eqz v4, :cond_14

    .line 297
    .line 298
    if-eqz v29, :cond_14

    .line 299
    .line 300
    iget-object v4, v5, LQ3/b;->m:LQ3/p;

    .line 301
    .line 302
    new-instance v7, LQ3/o;

    .line 303
    .line 304
    iget-object v8, v4, LQ3/p;->a:Lk4/q;

    .line 305
    .line 306
    invoke-direct {v7, v4, v8}, LQ3/o;-><init>(LQ3/p;Lk4/q;)V

    .line 307
    .line 308
    .line 309
    move-object/from16 v31, v7

    .line 310
    .line 311
    goto :goto_f

    .line 312
    :cond_14
    move-object/from16 v31, v17

    .line 313
    .line 314
    :goto_f
    iget-object v4, v5, LQ3/b;->b:Lo1/f;

    .line 315
    .line 316
    iget-object v7, v5, LQ3/b;->h:Lk4/N;

    .line 317
    .line 318
    iget-object v8, v5, LQ3/b;->u:LR3/c;

    .line 319
    .line 320
    iget-object v11, v5, LQ3/b;->f:Lcom/google/firebase/messaging/s;

    .line 321
    .line 322
    iget v12, v5, LQ3/b;->v:I

    .line 323
    .line 324
    iget-object v2, v1, LQ3/a;->a:[I

    .line 325
    .line 326
    iget v9, v1, LQ3/a;->b:I

    .line 327
    .line 328
    move-object/from16 v23, v2

    .line 329
    .line 330
    move-object/from16 v32, v3

    .line 331
    .line 332
    iget-wide v2, v5, LQ3/b;->g:J

    .line 333
    .line 334
    move/from16 v33, v0

    .line 335
    .line 336
    iget-object v0, v5, LQ3/b;->c:Lk4/W;

    .line 337
    .line 338
    iget-object v4, v4, Lo1/f;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v4, Lk4/l;

    .line 341
    .line 342
    invoke-interface {v4}, Lk4/l;->c()Lk4/m;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    if-eqz v0, :cond_15

    .line 347
    .line 348
    invoke-interface {v4, v0}, Lk4/m;->a(Lk4/W;)V

    .line 349
    .line 350
    .line 351
    :cond_15
    new-instance v18, LQ3/l;

    .line 352
    .line 353
    move-wide/from16 v27, v2

    .line 354
    .line 355
    move-object/from16 v26, v4

    .line 356
    .line 357
    move-object/from16 v19, v7

    .line 358
    .line 359
    move-object/from16 v20, v8

    .line 360
    .line 361
    move/from16 v25, v9

    .line 362
    .line 363
    move-object/from16 v30, v10

    .line 364
    .line 365
    move-object/from16 v21, v11

    .line 366
    .line 367
    move/from16 v22, v12

    .line 368
    .line 369
    invoke-direct/range {v18 .. v31}, LQ3/l;-><init>(Lk4/N;LR3/c;Lcom/google/firebase/messaging/s;I[ILi4/q;ILk4/m;JZLjava/util/ArrayList;LQ3/o;)V

    .line 370
    .line 371
    .line 372
    new-instance v0, LP3/g;

    .line 373
    .line 374
    iget v1, v1, LQ3/a;->b:I

    .line 375
    .line 376
    move-object v2, v6

    .line 377
    iget-object v6, v5, LQ3/b;->i:Lk4/q;

    .line 378
    .line 379
    iget-object v9, v5, LQ3/b;->d:Ln3/o;

    .line 380
    .line 381
    iget-object v10, v5, LQ3/b;->p:Ln3/l;

    .line 382
    .line 383
    iget-object v11, v5, LQ3/b;->e:Le1/q;

    .line 384
    .line 385
    iget-object v12, v5, LQ3/b;->o:LN3/G;

    .line 386
    .line 387
    move-wide/from16 v7, p5

    .line 388
    .line 389
    move-object/from16 v4, v18

    .line 390
    .line 391
    move-object/from16 v14, v31

    .line 392
    .line 393
    move-object/from16 v3, v32

    .line 394
    .line 395
    invoke-direct/range {v0 .. v12}, LP3/g;-><init>(I[I[Lj3/M;LP3/h;LN3/e0;Lk4/q;JLn3/o;Ln3/l;Le1/q;LN3/G;)V

    .line 396
    .line 397
    .line 398
    monitor-enter p0

    .line 399
    :try_start_0
    iget-object v1, v5, LQ3/b;->n:Ljava/util/IdentityHashMap;

    .line 400
    .line 401
    invoke-virtual {v1, v0, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    aput-object v0, p3, v33

    .line 406
    .line 407
    goto :goto_10

    .line 408
    :catchall_0
    move-exception v0

    .line 409
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 410
    throw v0

    .line 411
    :cond_16
    move-wide/from16 v7, p5

    .line 412
    .line 413
    move/from16 v33, v0

    .line 414
    .line 415
    move-object/from16 v0, v24

    .line 416
    .line 417
    const/4 v2, 0x2

    .line 418
    if-ne v4, v2, :cond_18

    .line 419
    .line 420
    iget-object v2, v5, LQ3/b;->w:Ljava/util/List;

    .line 421
    .line 422
    iget v1, v1, LQ3/a;->d:I

    .line 423
    .line 424
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, LR3/g;

    .line 429
    .line 430
    invoke-interface {v0}, Li4/q;->l()LN3/m0;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v0, v0, LN3/m0;->d:[Lj3/M;

    .line 435
    .line 436
    aget-object v0, v0, v16

    .line 437
    .line 438
    new-instance v2, LQ3/m;

    .line 439
    .line 440
    iget-object v3, v5, LQ3/b;->u:LR3/c;

    .line 441
    .line 442
    iget-boolean v3, v3, LR3/c;->d:Z

    .line 443
    .line 444
    invoke-direct {v2, v1, v0, v3}, LQ3/m;-><init>(LR3/g;Lj3/M;Z)V

    .line 445
    .line 446
    .line 447
    aput-object v2, p3, v33

    .line 448
    .line 449
    goto :goto_10

    .line 450
    :cond_17
    move-wide/from16 v7, p5

    .line 451
    .line 452
    move/from16 v33, v0

    .line 453
    .line 454
    move-object/from16 v0, v24

    .line 455
    .line 456
    instance-of v2, v1, LP3/g;

    .line 457
    .line 458
    if-eqz v2, :cond_18

    .line 459
    .line 460
    check-cast v1, LP3/g;

    .line 461
    .line 462
    iget-object v1, v1, LP3/g;->e:LP3/h;

    .line 463
    .line 464
    check-cast v1, LQ3/l;

    .line 465
    .line 466
    iput-object v0, v1, LQ3/l;->i:Li4/q;

    .line 467
    .line 468
    :cond_18
    :goto_10
    add-int/lit8 v0, v33, 0x1

    .line 469
    .line 470
    const/4 v2, -0x1

    .line 471
    const/4 v3, 0x1

    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_19
    move-wide/from16 v7, p5

    .line 475
    .line 476
    move/from16 v0, v16

    .line 477
    .line 478
    :goto_11
    array-length v1, v13

    .line 479
    if-ge v0, v1, :cond_1f

    .line 480
    .line 481
    aget-object v1, p3, v0

    .line 482
    .line 483
    if-nez v1, :cond_1e

    .line 484
    .line 485
    aget-object v1, v13, v0

    .line 486
    .line 487
    if-eqz v1, :cond_1e

    .line 488
    .line 489
    aget v1, v15, v0

    .line 490
    .line 491
    iget-object v2, v5, LQ3/b;->k:[LQ3/a;

    .line 492
    .line 493
    aget-object v1, v2, v1

    .line 494
    .line 495
    iget v2, v1, LQ3/a;->c:I

    .line 496
    .line 497
    const/4 v9, 0x1

    .line 498
    if-ne v2, v9, :cond_1d

    .line 499
    .line 500
    invoke-virtual {v5, v15, v0}, LQ3/b;->d([II)I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    const/4 v3, -0x1

    .line 505
    if-ne v2, v3, :cond_1a

    .line 506
    .line 507
    new-instance v1, LN3/n;

    .line 508
    .line 509
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 510
    .line 511
    .line 512
    aput-object v1, p3, v0

    .line 513
    .line 514
    :goto_12
    const/4 v10, 0x1

    .line 515
    goto :goto_14

    .line 516
    :cond_1a
    aget-object v2, p3, v2

    .line 517
    .line 518
    check-cast v2, LP3/g;

    .line 519
    .line 520
    iget v1, v1, LQ3/a;->b:I

    .line 521
    .line 522
    move/from16 v4, v16

    .line 523
    .line 524
    :goto_13
    iget-object v6, v2, LP3/g;->n:[LN3/c0;

    .line 525
    .line 526
    array-length v9, v6

    .line 527
    if-ge v4, v9, :cond_1c

    .line 528
    .line 529
    iget-object v9, v2, LP3/g;->b:[I

    .line 530
    .line 531
    aget v9, v9, v4

    .line 532
    .line 533
    if-ne v9, v1, :cond_1b

    .line 534
    .line 535
    iget-object v1, v2, LP3/g;->d:[Z

    .line 536
    .line 537
    aget-boolean v9, v1, v4

    .line 538
    .line 539
    const/4 v10, 0x1

    .line 540
    xor-int/2addr v9, v10

    .line 541
    invoke-static {v9}, Ll4/a;->m(Z)V

    .line 542
    .line 543
    .line 544
    aput-boolean v10, v1, v4

    .line 545
    .line 546
    aget-object v1, v6, v4

    .line 547
    .line 548
    invoke-virtual {v1, v7, v8, v10}, LN3/c0;->E(JZ)Z

    .line 549
    .line 550
    .line 551
    new-instance v1, LP3/f;

    .line 552
    .line 553
    aget-object v6, v6, v4

    .line 554
    .line 555
    invoke-direct {v1, v2, v2, v6, v4}, LP3/f;-><init>(LP3/g;LP3/g;LN3/c0;I)V

    .line 556
    .line 557
    .line 558
    aput-object v1, p3, v0

    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_1b
    const/4 v10, 0x1

    .line 562
    add-int/lit8 v4, v4, 0x1

    .line 563
    .line 564
    goto :goto_13

    .line 565
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 566
    .line 567
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 568
    .line 569
    .line 570
    throw v0

    .line 571
    :cond_1d
    move v10, v9

    .line 572
    const/4 v3, -0x1

    .line 573
    goto :goto_14

    .line 574
    :cond_1e
    const/4 v3, -0x1

    .line 575
    goto :goto_12

    .line 576
    :goto_14
    add-int/lit8 v0, v0, 0x1

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_1f
    new-instance v0, Ljava/util/ArrayList;

    .line 580
    .line 581
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 582
    .line 583
    .line 584
    new-instance v1, Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 587
    .line 588
    .line 589
    move-object/from16 v14, p3

    .line 590
    .line 591
    array-length v2, v14

    .line 592
    move/from16 v3, v16

    .line 593
    .line 594
    :goto_15
    if-ge v3, v2, :cond_22

    .line 595
    .line 596
    aget-object v4, v14, v3

    .line 597
    .line 598
    instance-of v6, v4, LP3/g;

    .line 599
    .line 600
    if-eqz v6, :cond_20

    .line 601
    .line 602
    check-cast v4, LP3/g;

    .line 603
    .line 604
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    goto :goto_16

    .line 608
    :cond_20
    instance-of v6, v4, LQ3/m;

    .line 609
    .line 610
    if-eqz v6, :cond_21

    .line 611
    .line 612
    check-cast v4, LQ3/m;

    .line 613
    .line 614
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    :cond_21
    :goto_16
    add-int/lit8 v3, v3, 0x1

    .line 618
    .line 619
    goto :goto_15

    .line 620
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    new-array v2, v2, [LP3/g;

    .line 625
    .line 626
    iput-object v2, v5, LQ3/b;->r:[LP3/g;

    .line 627
    .line 628
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    new-array v0, v0, [LQ3/m;

    .line 636
    .line 637
    iput-object v0, v5, LQ3/b;->s:[LQ3/m;

    .line 638
    .line 639
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    iget-object v0, v5, LQ3/b;->l:LF5/e;

    .line 643
    .line 644
    iget-object v1, v5, LQ3/b;->r:[LP3/g;

    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    new-instance v0, Lb7/c;

    .line 650
    .line 651
    const/16 v2, 0xb

    .line 652
    .line 653
    invoke-direct {v0, v2, v1}, Lb7/c;-><init>(ILjava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    iput-object v0, v5, LQ3/b;->t:Lb7/c;

    .line 657
    .line 658
    return-wide v7
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method public final z(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/b;->t:Lb7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lb7/c;->z(J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
