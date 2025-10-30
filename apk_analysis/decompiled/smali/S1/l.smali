.class public final LS1/l;
.super LM1/r;
.source "SourceFile"


# instance fields
.field public final f:LP2/i;

.field public final g:LP2/y;

.field public final h:LL2/l;

.field public final i:Lb8/Q;

.field public final j:Lb8/H;

.field public final k:Lb8/Q;

.field public final l:Lb8/H;

.field public m:Ljava/lang/Long;


# direct methods
.method public constructor <init>(LP2/i;LP2/y;LL2/l;)V
    .locals 1

    .line 1
    const-string v0, "getLocalUserUseCase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "updateAvatarUseCase"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "getLocalAvatarsUseCase"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, LM1/r;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LS1/l;->f:LP2/i;

    .line 20
    .line 21
    iput-object p2, p0, LS1/l;->g:LP2/y;

    .line 22
    .line 23
    iput-object p3, p0, LS1/l;->h:LL2/l;

    .line 24
    .line 25
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-static {p2}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, LS1/l;->i:Lb8/Q;

    .line 32
    .line 33
    new-instance p3, Lb8/H;

    .line 34
    .line 35
    invoke-direct {p3, p2}, Lb8/H;-><init>(Lb8/F;)V

    .line 36
    .line 37
    .line 38
    iput-object p3, p0, LS1/l;->j:Lb8/H;

    .line 39
    .line 40
    sget-object p2, LB7/t;->a:LB7/t;

    .line 41
    .line 42
    invoke-static {p2}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iput-object p2, p0, LS1/l;->k:Lb8/Q;

    .line 47
    .line 48
    new-instance p3, Lb8/H;

    .line 49
    .line 50
    invoke-direct {p3, p2}, Lb8/H;-><init>(Lb8/F;)V

    .line 51
    .line 52
    .line 53
    iput-object p3, p0, LS1/l;->l:Lb8/H;

    .line 54
    .line 55
    invoke-virtual {p1}, LP2/i;->a()LH2/y;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x0

    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    iget-object p1, p1, LH2/y;->f:Ljava/lang/Long;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object p1, p2

    .line 66
    :goto_0
    iput-object p1, p0, LS1/l;->m:Ljava/lang/Long;

    .line 67
    .line 68
    new-instance p1, LS1/j;

    .line 69
    .line 70
    invoke-direct {p1, p0, p2}, LS1/j;-><init>(LS1/l;LE7/d;)V

    .line 71
    .line 72
    .line 73
    const/4 p2, 0x0

    .line 74
    invoke-virtual {p0, p2, p1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 75
    .line 76
    .line 77
    return-void
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
.end method
