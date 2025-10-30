.class public final Li7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LS6/b;


# direct methods
.method public constructor <init>(LS6/b;)V
    .locals 1

    .line 1
    const-string v0, "transportFactoryProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li7/l;->a:LS6/b;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final a(Li7/N;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li7/l;->a:LS6/b;

    .line 2
    .line 3
    invoke-interface {v0}, LS6/b;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LV2/f;

    .line 8
    .line 9
    new-instance v1, LV2/c;

    .line 10
    .line 11
    const-string v2, "json"

    .line 12
    .line 13
    invoke-direct {v1, v2}, LV2/c;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, LC3/v;

    .line 17
    .line 18
    const/16 v3, 0x1d

    .line 19
    .line 20
    invoke-direct {v2, v3, p0}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, LY2/q;

    .line 24
    .line 25
    const-string v3, "FIREBASE_APPQUALITY_SESSION"

    .line 26
    .line 27
    invoke-virtual {v0, v3, v1, v2}, LY2/q;->a(Ljava/lang/String;LV2/c;LV2/e;)LY2/r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, LV2/a;

    .line 32
    .line 33
    sget-object v2, LV2/d;->a:LV2/d;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v1, v3, p1, v2, v3}, LV2/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;LV2/d;LV2/b;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, LX0/k;

    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    invoke-direct {p1, v2}, LX0/k;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, LY2/r;->L(LV2/a;LV2/g;)V

    .line 46
    .line 47
    .line 48
    return-void
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
