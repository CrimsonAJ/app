.class public final Lco/notix/callback/NotixCallback$Unsubscription;
.super Lco/notix/callback/NotixCallback;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/callback/NotixCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unsubscription"
.end annotation


# instance fields
.field private final data:Ljava/lang/String;

.field private final status:Lco/notix/callback/NotixCallbackStatus;


# direct methods
.method public constructor <init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/notix/callback/NotixCallback;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/notix/callback/NotixCallback$Unsubscription;->status:Lco/notix/callback/NotixCallbackStatus;

    iput-object p2, p0, Lco/notix/callback/NotixCallback$Unsubscription;->data:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/notix/callback/NotixCallback$Unsubscription;Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;ILjava/lang/Object;)Lco/notix/callback/NotixCallback$Unsubscription;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/notix/callback/NotixCallback$Unsubscription;->copy(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)Lco/notix/callback/NotixCallback$Unsubscription;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/notix/callback/NotixCallbackStatus;
    .locals 1

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)Lco/notix/callback/NotixCallback$Unsubscription;
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/notix/callback/NotixCallback$Unsubscription;

    invoke-direct {v0, p1, p2}, Lco/notix/callback/NotixCallback$Unsubscription;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/notix/callback/NotixCallback$Unsubscription;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/notix/callback/NotixCallback$Unsubscription;

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object v1

    invoke-virtual {p1}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/notix/callback/NotixCallback$Unsubscription;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lco/notix/callback/NotixCallbackStatus;
    .locals 1

    iget-object v0, p0, Lco/notix/callback/NotixCallback$Unsubscription;->status:Lco/notix/callback/NotixCallbackStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsubscription(status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getStatus()Lco/notix/callback/NotixCallbackStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lco/notix/callback/NotixCallback$Unsubscription;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
