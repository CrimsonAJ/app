.class public final LR1/A;
.super LM1/r;
.source "SourceFile"


# instance fields
.field public final f:LO2/B;

.field public final g:LO2/n;

.field public final h:LO2/U;

.field public final i:Lb8/Q;

.field public final j:Lb8/H;

.field public final k:Lb8/Q;

.field public final l:Lb8/Q;

.field public m:LI2/a;

.field public final n:Lb8/Q;

.field public final o:Lb8/H;

.field public p:Z


# direct methods
.method public constructor <init>(LO2/B;LO2/n;LO2/U;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "getListEpisodeUseCase"

    .line 10
    .line 11
    invoke-static {v1, v4}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "getAnimeEpisodeUseCase"

    .line 15
    .line 16
    invoke-static {v2, v4}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "hlsParserUseCase"

    .line 20
    .line 21
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, LM1/r;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, v0, LR1/A;->f:LO2/B;

    .line 28
    .line 29
    iput-object v2, v0, LR1/A;->g:LO2/n;

    .line 30
    .line 31
    iput-object v3, v0, LR1/A;->h:LO2/U;

    .line 32
    .line 33
    sget-object v1, LB7/t;->a:LB7/t;

    .line 34
    .line 35
    invoke-static {v1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, v0, LR1/A;->i:Lb8/Q;

    .line 40
    .line 41
    new-instance v2, Lb8/H;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lb8/H;-><init>(Lb8/F;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, v0, LR1/A;->j:Lb8/H;

    .line 47
    .line 48
    sget-object v1, LJ2/c;->b:LJ2/c;

    .line 49
    .line 50
    new-instance v2, LA7/h;

    .line 51
    .line 52
    const-string v3, ""

    .line 53
    .line 54
    invoke-direct {v2, v1, v3}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, LB7/y;->E(LA7/h;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, v0, LR1/A;->k:Lb8/Q;

    .line 66
    .line 67
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-static {v1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, v0, LR1/A;->l:Lb8/Q;

    .line 74
    .line 75
    new-instance v2, LI2/a;

    .line 76
    .line 77
    const/4 v14, 0x0

    .line 78
    const/4 v15, 0x0

    .line 79
    const-wide/16 v3, 0x0

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    const-wide/16 v11, 0x0

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const/16 v16, 0x1fff

    .line 91
    .line 92
    invoke-direct/range {v2 .. v16}, LI2/a;-><init>(JILjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;LI2/b;JZZZI)V

    .line 93
    .line 94
    .line 95
    iput-object v2, v0, LR1/A;->m:LI2/a;

    .line 96
    .line 97
    new-instance v1, LM1/t;

    .line 98
    .line 99
    sget-object v2, LR1/v;->b:LR1/v;

    .line 100
    .line 101
    invoke-direct {v1, v2}, LM1/t;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iput-object v1, v0, LR1/A;->n:Lb8/Q;

    .line 109
    .line 110
    new-instance v2, Lb8/H;

    .line 111
    .line 112
    invoke-direct {v2, v1}, Lb8/H;-><init>(Lb8/F;)V

    .line 113
    .line 114
    .line 115
    iput-object v2, v0, LR1/A;->o:Lb8/H;

    .line 116
    .line 117
    return-void
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
