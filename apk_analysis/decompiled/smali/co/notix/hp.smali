.class public final Lco/notix/hp;
.super Lco/notix/s8;
.source "SourceFile"


# static fields
.field public static final c:Lco/notix/hp;

.field public static final d:Lco/notix/gp;

.field public static final e:Lco/notix/fp;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/hp;

    invoke-direct {v0}, Lco/notix/hp;-><init>()V

    sput-object v0, Lco/notix/hp;->c:Lco/notix/hp;

    new-instance v0, Lco/notix/gp;

    invoke-direct {v0}, Lco/notix/gp;-><init>()V

    sput-object v0, Lco/notix/hp;->d:Lco/notix/gp;

    new-instance v0, Lco/notix/fp;

    invoke-direct {v0}, Lco/notix/fp;-><init>()V

    sput-object v0, Lco/notix/hp;->e:Lco/notix/fp;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "sendMetrics"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lco/notix/s8;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Lco/notix/td;
    .locals 1

    sget-object v0, Lco/notix/hp;->e:Lco/notix/fp;

    return-object v0
.end method

.method public final b()Lco/notix/td;
    .locals 1

    sget-object v0, Lco/notix/hp;->d:Lco/notix/gp;

    return-object v0
.end method

.method public final c()Lco/notix/t8;
    .locals 2

    .line 1
    new-instance v0, Lco/notix/dp;

    .line 2
    .line 3
    sget-object v1, Lco/notix/wq;->p:Lco/notix/ie;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lco/notix/dp;-><init>(Lco/notix/ie;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
